DROP TABLE IF EXISTS newsletter_subscribers;
DROP TABLE IF EXISTS partners;
DROP TABLE IF EXISTS impact_stats;
DROP TABLE IF EXISTS collection_points;
DROP TABLE IF EXISTS products;
DROP TABLE IF EXISTS services;
DROP TABLE IF EXISTS homepage_sections;

CREATE TABLE homepage_sections (
    id BIGSERIAL PRIMARY KEY,
    section_key VARCHAR(100) NOT NULL UNIQUE,
    eyebrow VARCHAR(150),
    title VARCHAR(255) NOT NULL,
    subtitle TEXT,
    description TEXT,
    extra_description TEXT,
    button_text VARCHAR(100),
    button_link VARCHAR(255) DEFAULT '#',
    image_url VARCHAR(255),
    display_order INTEGER DEFAULT 0,
    active BOOLEAN DEFAULT TRUE
);

CREATE TABLE services (
    id BIGSERIAL PRIMARY KEY,
    name VARCHAR(150) NOT NULL,
    slug VARCHAR(150) NOT NULL UNIQUE,
    short_description TEXT,
    description TEXT,
    image_url VARCHAR(255),
    display_order INTEGER DEFAULT 0,
    active BOOLEAN DEFAULT TRUE
);

CREATE TABLE products (
    id BIGSERIAL PRIMARY KEY,
    name VARCHAR(150) NOT NULL,
    slug VARCHAR(150) NOT NULL UNIQUE,
    short_description TEXT,
    description TEXT,
    image_url VARCHAR(255),
    display_order INTEGER DEFAULT 0,
    active BOOLEAN DEFAULT TRUE
);

CREATE TABLE collection_points (
    id BIGSERIAL PRIMARY KEY,
    city VARCHAR(100) NOT NULL,
    location_name VARCHAR(150),
    address TEXT,
    phone VARCHAR(100),
    display_order INTEGER DEFAULT 0,
    active BOOLEAN DEFAULT TRUE
);

CREATE TABLE impact_stats (
    id BIGSERIAL PRIMARY KEY,
    title VARCHAR(150) NOT NULL,
    value VARCHAR(100) NOT NULL,
    description TEXT,
    category VARCHAR(100) NOT NULL,
    display_order INTEGER DEFAULT 0,
    active BOOLEAN DEFAULT TRUE
);

CREATE TABLE partners (
    id BIGSERIAL PRIMARY KEY,
    name VARCHAR(150) NOT NULL,
    logo_url VARCHAR(255),
    website_url VARCHAR(255) DEFAULT '#',
    display_order INTEGER DEFAULT 0,
    active BOOLEAN DEFAULT TRUE
);

CREATE TABLE newsletter_subscribers (
    id BIGSERIAL PRIMARY KEY,
    email VARCHAR(180) NOT NULL UNIQUE,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);