INSERT INTO homepage_sections 
(section_key, eyebrow, title, subtitle, description, extra_description, button_text, button_link, image_url, display_order, active)
VALUES
('hero', 'Bottle Logistics', 'Reimagining Glass Waste into Refined Cullet', NULL,
 'At Bottle Logistics, we transform discarded glass into high-quality, furnace-ready cullet through innovative recycling.',
 NULL, 'Schedule a Pickup', '#', '/images/hero.jpg', 1, TRUE),

('core_values', 'Core Values', 'Key Pillars', NULL,
 'Our operations are driven by the circular economy principles of recovery, reduction, recycling, and reuse.',
 NULL, NULL, '#', NULL, 2, TRUE),

('our_story', 'Our Story', 'Revolutionizing Glass Recycling', 'Since 2019',
 'Bottle Logistics has been at the forefront of the recycling revolution, creating innovative solutions for bottle collection and processing that minimize waste and maximize resource recovery.',
 'Our comprehensive approach includes collection, sorting, cleaning, and repurposing bottles for various industries, reducing the environmental impact of waste disposal, and while creating valuable resources for communities.',
 'Follow our journey', '#', NULL, 3, TRUE),

('social_responsibility', 'Social Responsibility', 'Empowering People, Transforming Lives', NULL,
 'Our commitment goes beyond recycling. We are building a safer, fairer, and more inclusive future for our community.',
 NULL, 'Read detailed impact report', '#', NULL, 4, TRUE),

('environmental_impact', 'Impact section background', 'Environmental Impact', 'Year 2025 Milestones',
 'See how our collective efforts are creating positive change for the planet.',
 NULL, 'View Full Impact Report', '#', NULL, 5, TRUE),

('partners', 'Our Network', 'Trusted Partners', NULL,
 'Collaborating with industry leaders to build a sustainable glass recycling ecosystem.',
 NULL, 'Partner With Us', '#', NULL, 6, TRUE);

INSERT INTO services 
(name, slug, short_description, description, image_url, display_order, active)
VALUES
('Glass Bottle Washing', 'glass-bottle-washing',
 'Industrial-grade glass bottle cleaning solutions for safe reuse.',
 'State-of-the-art washing facilities ensuring bottles are thoroughly cleaned and sanitized for safe reuse in the beverage industry.',
 NULL, 1, TRUE),

('Glass Waste Management', 'glass-waste-management',
 'End-to-end glass waste collection, sorting and processing.',
 'Comprehensive collection, sorting, and processing solutions for glass waste. We ensure efficient recycling logistics for businesses and communities.',
 NULL, 2, TRUE);

INSERT INTO products 
(name, slug, short_description, description, image_url, display_order, active)
VALUES
('Glass Cullet And Glass Aggregate', 'glass-cullet-and-glass-aggregate',
 'Recycled glass material for manufacturing and construction.',
 'High-quality recycled glass cullet and aggregate processed from glass waste.',
 NULL, 1, TRUE),

('Reusable Bottles', 'reusable-bottles',
 'Clean and inspected bottles for circular packaging systems.',
 'Reusable bottles help reduce packaging costs and keep quality glass in circulation.',
 NULL, 2, TRUE),

('Upcycled Tableware', 'upcycled-tableware',
 'Functional tableware handcrafted from recycled glass bottles.',
 'Thoughtfully designed tableware that gives discarded glass bottles a second life.',
 NULL, 3, TRUE);

INSERT INTO collection_points 
(city, location_name, address, phone, display_order, active)
VALUES
('Embu', NULL, NULL, NULL, 1, TRUE),
('Kambu', NULL, NULL, NULL, 2, TRUE),
('Nairobi', NULL, NULL, NULL, 3, TRUE),
('Kisumu', NULL, NULL, NULL, 4, TRUE),
('Mombasa', NULL, NULL, NULL, 5, TRUE);

INSERT INTO impact_stats 
(title, value, description, category, display_order, active)
VALUES
('Jobs Created', '550+', '250 direct & 150 indirect jobs', 'social', 1, TRUE),
('Women Employed', '62%', 'Prioritizing equality', 'social', 2, TRUE),
('Empowerment', '100%', 'Health & Safety training', 'social', 3, TRUE),
('Ethical Sourcing', '100%', 'Zero Child Labour', 'social', 4, TRUE),

('Glass Waste Diverted', '66,400 Tons', 'Glass waste diverted from the environment and landfills to date.', 'environmental', 1, TRUE),
('Virgin Materials Saved', '66,400 Tons', 'Sand and other raw materials saved from mining operations.', 'environmental', 2, TRUE),
('Carbon Emissions Reduced', '11,066 Tons CO₂', 'Total carbon emissions prevented through our recycling initiatives to date.', 'environmental', 3, TRUE);

INSERT INTO partners 
(name, logo_url, website_url, display_order, active)
VALUES
('Aquamist', '/images/aqua.png', '#', 1, TRUE),
('Coca-Cola', '/images/coke.png', '#', 2, TRUE),
('KWAL', '/images/kwal.jpg', '#', 3, TRUE),
('Heineken', '/images/heinken.png', '#', 4, TRUE);