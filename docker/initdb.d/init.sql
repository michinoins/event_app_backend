CREATE TABLE IF NOT EXISTS event(
`id` varchar(36) NOT NULL,
`name` varchar(50) NOT NULL,
`description` varchar(1000) NOT NULL,
`event_date` DATE NOT NULL ,
`available_tickets` Int NOT NULL ,
`created_at`  datetime NOT NULL,
`updated_at`  datetime NOT NULL,
PRIMARY KEY (`id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

INSERT INTO event (id,name,description,event_date,available_tickets,created_at,updated_at)
VALUES
('1','National Awareness Day','You won\'t have time for sleeping, soldier, not with all the bed makingyou\'ll be doing. Guess again. No, I\'m Santa Claus! Bender! Ship! Stop bickering or I\'m going to come back there and change your opinions manually!','2022-01-09',10,'2022-01-05','2021-01-05'),
('2','Universal Entrepreneurship Expo','I suppose I could part with \'one\' and still be feared... Enough about your promiscuous mother, Hermes! We have bigger problems. Ummm...to eBay? Can I use the gun?','2022-01-09',5,'2022-01-05','2021-01-05'),
('3','Wine festival','All I want is to be a monkey of moderate intelligence who wears a suit... that\'s why I\'m transferring to business school! Meh. We\'ll go deliver this crate like professionals, and then we\'ll go home.','2022-01-09',1,'2022-01-05','2021-01-05'),
('4',' Annual Bicycle Appreciation Day','Yes, if you make it look like an electrical fire. When you do things right, people won\'t be sure you\'ve done anything at all. Oh dear! She\'s stuck in an infinite loop, and he\'s an idiot! Well, that\'s love for you.','2022-01-09',200,'2022-01-05','2021-01-05'),
('5','Rocket to Mars','I\'m nobody\'s taxi service; I\'m not gonna be there to catch you every time you feel like jumping out of a spaceship. I\'m the Doctor, I\'m worse than everyone\'s aunt. *catches himself* And that is not how I\'m introducing myself.','2022-01-09',0,'2022-01-05','2021-01-05');