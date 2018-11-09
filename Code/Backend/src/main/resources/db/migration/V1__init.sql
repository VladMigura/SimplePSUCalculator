CREATE TABLE motherboard (
  id BIGSERIAL PRIMARY KEY,
  name TEXT NOT NULL,
  vendor TEXT NOT NULL,
  socket TEXT NOT NULL,
  chipset TEXT NOT NULL,
  form TEXT NOT NULL,
  type_of_memory TEXT NOT NULL,
  num_of_memory_slots INTEGER NOT NULL,
  max_memory_volume INTEGER NOT NULL,
  num_of_memory_channels INTEGER NOT NULL,
  built_in_graphics BOOLEAN NOT NULL,
  year_of_issue TEXT NOT NULL,
  price NUMERIC NOT NULL,
  image_url TEXT NOT NULL
);

CREATE TABLE cpu (
  id BIGSERIAL PRIMARY KEY,
  name TEXT NOT NULL,
  vendor TEXT NOT NULL,
  family TEXT NOT NULL,
  codename TEXT NOT NULL,
  socket TEXT NOT NULL,
  num_of_cores INTEGER NOT NULL,
  num_of_threads INTEGER NOT NULL,
  clock_frequency NUMERIC NOT NULL,
  max_clock_frequency NUMERIC NOT NULL,
  tdp INTEGER NOT NULL,
  built_in_graphics BOOLEAN NOT NULL,
  year_of_issue TEXT NOT NULL,
  price NUMERIC NOT NULL,
  image_url TEXT NOT NULL
);

CREATE TABLE psu (
  id BIGSERIAL PRIMARY KEY,
  name TEXT NOT NULL,
  vendor TEXT NOT NULL,
  power INTEGER NOT NULL,
  efficiency INTEGER NOT NULL,
  certificate BOOLEAN NOT NULL,
  price NUMERIC NOT NULL,
  image_url TEXT NOT NULL
);

CREATE TABLE videocard (
  id BIGSERIAL PRIMARY KEY,
  name TEXT NOT NULL,
  vendor TEXT NOT NULL,
  gpu_vendor TEXT NOT NULL,
  clock_frequency NUMERIC NOT NULL,
  max_clock_frequency NUMERIC NOT NULL,
  memory_volume NUMERIC NOT NULL,
  type_of_memory TEXT NOT NULL,
  vga_support BOOLEAN NOT NULL,
  dvi_support BOOLEAN NOT NULL,
  hdmi_support BOOLEAN NOT NULL,
  desplay_port_support BOOLEAN NOT NULL,
  year_of_issue TEXT NOT NULL,
  price NUMERIC NOT NULL,
  image_url TEXT NOT NULL
)