INSERT INTO patients(lastName, MID, OBEligibility) VALUES
('Song',1234,1);


INSERT INTO OBOfficeVisit(
  patientMID,
  locationID,
  apptTypeID,
  currentDate,
  numOfWeeks,
  weight,
  bloodPressure,
  fetalHeartRate,
  isMultiplePregnancy,
  numOfMultiplePregnancy,
  isLowLyingPlacentaObserved
)
VALUES(
  1234,
  '1',
  1,
  '2018-11-30',
  '10-5',
  70.1,
  '120/120',
  6,
  1,
  2,
  1
);

INSERT INTO UltrasoundRecord (
	obOfficeVisitID,
	patientMID,
	locationID,
	crownRumpLength,
	biparietalDiameter,
	headCircumference,
	femurLength,
	occipitofrontalDiameter,
	abdominalCircumference,
	humerusLength,
	estimatedFetalWeight,
	image,
	imageFormat
)
VALUES (
	(SELECT MAX(visitID) FROM OBOfficeVisit WHERE OBOfficeVisit.patientMID = 1234),
	1234,
	'1',
	3.0,
	3.0,
	3.0,
	3.0,
	3.0,
	3.0,
	3.0,
	3.0,
	x'89504E470D0A1A0A0000000D494844520000001000000010080200000090916836000000017352474200AECE1CE90000000467414D410000B18F0BFC6105000000097048597300000EC300000EC301C76FA8640000001E49444154384F6350DAE843126220493550F1A80662426C349406472801006AC91F1040F796BD0000000049454E44AE426082',
	'png'
);