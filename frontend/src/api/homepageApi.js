const API_BASE_URL = 'http://localhost:8080/api'

export async function getHomepageData() {
  const response = await fetch(`${API_BASE_URL}/homepage`)

  if (!response.ok) {
    throw new Error('Failed to fetch homepage data')
  }

  return response.json()
}