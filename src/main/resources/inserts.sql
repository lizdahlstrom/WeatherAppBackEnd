INSERT INTO weather_db.weather_station (name) VALUES ('station-45');
INSERT INTO weather_db.weather_station (name) VALUES ('station-423');
INSERT INTO weather_db.weather_station (name) VALUES ('station-134');
INSERT INTO weather_db.weather_info (air_pressure, cloud_base, cloud_type, date, humidity, okta, wind_direction, wind_force, weather_station_id) VALUES (32, 4, 'makrillmoln', '2017-02-16', 4, 23, 'syd', 42, 1);
INSERT INTO weather_db.weather_info (air_pressure, cloud_base, cloud_type, date, humidity, okta, wind_direction, wind_force, weather_station_id) VALUES (65, 266, 'makrillmoln', '2017-02-13', 5, 2, 'nord', 64, 1);
INSERT INTO weather_db.weather_info (air_pressure, cloud_base, cloud_type, date, humidity, okta, wind_direction, wind_force, weather_station_id) VALUES (64, 23, 'makrillmoln', '2017-02-14', 6, 24, 'ost', 64, 1);
INSERT INTO weather_db.weather_station_weather_info (weather_station_id, weather_info_id) VALUES (1, 1);
INSERT INTO weather_db.weather_station_weather_info (weather_station_id, weather_info_id) VALUES (1, 2);
INSERT INTO weather_db.weather_station_weather_info (weather_station_id, weather_info_id) VALUES (1, 3);