<template>
  <div v-if="loading" class="loading-page">
    Loading Bottle Logistics...
  </div>

  <div v-else-if="error" class="loading-page error-text">
    {{ error }}
  </div>

  <template v-else>
    <section class="hero">
      <div class="hero-overlay">
        <p class="eyebrow">{{ section('hero')?.eyebrow }}</p>
        <h1>{{ section('hero')?.title }}</h1>
        <p>{{ section('hero')?.description }}</p>

        <div class="hero-buttons">
          <a href="#">{{ section('hero')?.buttonText }}</a>
          <a href="#" class="secondary">Learn More</a>
        </div>
      </div>
    </section>

    <section class="core-values section">
      <p class="eyebrow">{{ section('core_values')?.eyebrow }}</p>
      <h2>{{ section('core_values')?.title }}</h2>
      <p>{{ section('core_values')?.description }}</p>

      <div class="value-grid">
        <div>Recover</div>
        <div>Reduce</div>
        <div>Recycle</div>
        <div>Reuse</div>
      </div>
    </section>

    <section class="story section">
      <div>
        <p class="eyebrow">{{ section('our_story')?.eyebrow }}</p>
        <h2>
          At Bottle Logistics, we're committed to transforming glass waste into
          resources through innovative collection and recycling solutions.
        </h2>
      </div>

      <div class="story-card">
        <span>{{ section('our_story')?.subtitle }}</span>
        <h3>{{ section('our_story')?.title }}</h3>
        <p>{{ section('our_story')?.description }}</p>
        <p>
          Our comprehensive approach includes collection, sorting, cleaning, and
          repurposing bottles for various industries, reducing the environmental
          impact of waste disposal, and while creating valuable resources for communities.
        </p>

        <div class="mini-pillars">
          <strong>Recover</strong>
          <strong>Reduce</strong>
          <strong>Recycle</strong>
          <strong>Reuse</strong>
        </div>

        <a href="#" class="text-link">{{ section('our_story')?.buttonText }}</a>
      </div>
    </section>

    <section class="responsibility section">
      <p class="eyebrow">{{ section('social_responsibility')?.eyebrow }}</p>
      <h2>{{ section('social_responsibility')?.title }}</h2>
      <p>{{ section('social_responsibility')?.description }}</p>

      <div class="stats-grid">
        <div v-for="stat in socialStats" :key="stat.id">
          <h3>{{ stat.value }}</h3>
          <strong>{{ stat.title }}</strong>
          <p>{{ stat.description }}</p>
        </div>
      </div>

      <a href="#" class="primary-btn">
        {{ section('social_responsibility')?.buttonText }}
      </a>
    </section>

    <section class="impact section">
      <p class="eyebrow">Impact section background</p>
      <h2>{{ section('environmental_impact')?.eyebrow }}</h2>
      <p>{{ section('environmental_impact')?.description }}</p>

      <div class="impact-grid">
        <div v-for="stat in environmentalStats" :key="stat.id">
          <h3>{{ stat.value }}</h3>
          <strong>{{ stat.title }}</strong>
          <p>{{ stat.description }}</p>
        </div>
      </div>

      <a href="#" class="primary-btn">
        {{ section('environmental_impact')?.buttonText }}
      </a>
    </section>

    <section class="partners section">
      <p class="eyebrow">{{ section('partners')?.eyebrow }}</p>
      <h2>{{ section('partners')?.title }}</h2>
      <p>{{ section('partners')?.description }}</p>

      <div class="partner-logos">
        <div v-for="partner in partners" :key="partner.id" class="partner-logo-card">
          <img
            v-if="partner.logoUrl"
            :src="partner.logoUrl"
            :alt="partner.name"
          />
          <div v-else class="placeholder-logo">
            {{ partner.name }}
          </div>
        </div>
      </div>

      <div class="partner-cta">
        <p>Interested in becoming a partner?</p>
        <a href="#">{{ section('partners')?.buttonText }}</a>
      </div>
    </section>
  </template>
</template>

<script setup>
import { computed, onMounted, ref } from 'vue'
import { getHomepageData } from '../api/homepageApi'

const loading = ref(true)
const error = ref('')
const homepageData = ref({
  sections: [],
  socialStats: [],
  environmentalStats: [],
  partners: []
})

onMounted(async () => {
  try {
    homepageData.value = await getHomepageData()
  } catch (err) {
    error.value = 'Could not load homepage data from backend.'
  } finally {
    loading.value = false
  }
})

const sections = computed(() => homepageData.value.sections || [])
const socialStats = computed(() => homepageData.value.socialStats || [])
const environmentalStats = computed(() => homepageData.value.environmentalStats || [])
const partners = computed(() => homepageData.value.partners || [])

function section(key) {
  return sections.value.find(item => item.sectionKey === key)
}
</script>