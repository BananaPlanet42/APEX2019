package frc.arcs;

import com.team319.follower.SrxMotionProfile;
import com.team319.follower.SrxTrajectory;

public class LeftSideCloseCargoArc extends SrxTrajectory {
	
	// WAYPOINTS:
	// (X,Y,degrees)
	// (5.30,17.50,0.00)
	// (14.30,17.50,30.00)
	// (22.30,14.50,119.90)
	
    public LeftSideCloseCargoArc() {
		super();
		this.highGear = true;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	
    public LeftSideCloseCargoArc(boolean flipped) {
		super();
		this.highGear = true;
		this.flipped = flipped;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	public boolean highGear = true;

	double[][] centerPoints = {
				{0.000,0.000,10.000,0.000},
				{3.129,31.291,10.000,0.000},
				{9.387,62.582,10.000,0.000},
				{18.775,93.873,10.000,0.000},
				{31.291,125.165,10.000,0.000},
				{46.937,156.456,10.000,0.000},
				{65.711,187.747,10.000,0.000},
				{87.615,219.038,10.000,0.000},
				{112.648,250.329,10.000,0.000},
				{140.810,281.620,10.000,0.010},
				{172.101,312.911,10.000,0.010},
				{206.521,344.202,10.000,0.010},
				{244.071,375.494,10.000,0.020},
				{284.749,406.785,10.000,0.030},
				{328.557,438.076,10.000,0.030},
				{375.494,469.367,10.000,0.040},
				{425.559,500.658,10.000,0.060},
				{478.754,531.949,10.000,0.070},
				{535.078,563.240,10.000,0.090},
				{594.532,594.532,10.000,0.110},
				{657.114,625.823,10.000,0.130},
				{722.825,657.114,10.000,0.160},
				{791.666,688.405,10.000,0.190},
				{863.635,719.696,10.000,0.230},
				{938.734,750.987,10.000,0.260},
				{1016.962,782.278,10.000,0.310},
				{1098.319,813.570,10.000,0.360},
				{1182.805,844.861,10.000,0.410},
				{1270.420,876.152,10.000,0.470},
				{1361.164,907.443,10.000,0.540},
				{1455.038,938.734,10.000,0.610},
				{1552.040,970.025,10.000,0.690},
				{1652.172,1001.316,10.000,0.780},
				{1755.433,1032.607,10.000,0.880},
				{1861.823,1063.899,10.000,0.980},
				{1971.342,1095.190,10.000,1.090},
				{2083.990,1126.481,10.000,1.200},
				{2199.767,1157.772,10.000,1.330},
				{2318.673,1189.063,10.000,1.470},
				{2440.709,1220.354,10.000,1.610},
				{2565.873,1251.645,10.000,1.760},
				{2694.167,1282.937,10.000,1.930},
				{2825.589,1314.228,10.000,2.100},
				{2960.141,1345.519,10.000,2.280},
				{3097.822,1376.810,10.000,2.470},
				{3238.632,1408.101,10.000,2.670},
				{3382.572,1439.392,10.000,2.880},
				{3529.640,1470.683,10.000,3.100},
				{3679.837,1501.974,10.000,3.330},
				{3833.164,1533.266,10.000,3.570},
				{3989.620,1564.557,10.000,3.820},
				{4149.205,1595.848,10.000,4.080},
				{4311.918,1627.139,10.000,4.350},
				{4477.761,1658.430,10.000,4.630},
				{4646.734,1689.721,10.000,4.920},
				{4818.835,1721.012,10.000,5.210},
				{4994.065,1752.304,10.000,5.520},
				{5172.425,1783.595,10.000,5.830},
				{5353.913,1814.886,10.000,6.150},
				{5538.531,1846.177,10.000,6.480},
				{5726.278,1877.468,10.000,6.810},
				{5917.154,1908.759,10.000,7.160},
				{6111.159,1940.050,10.000,7.500},
				{6306.728,1955.696,10.000,7.850},
				{6502.298,1955.696,10.000,8.200},
				{6697.867,1955.696,10.000,8.540},
				{6893.437,1955.696,10.000,8.890},
				{7089.007,1955.696,10.000,9.230},
				{7284.576,1955.696,10.000,9.560},
				{7480.146,1955.696,10.000,9.900},
				{7675.715,1955.696,10.000,10.230},
				{7871.285,1955.696,10.000,10.550},
				{8066.855,1955.696,10.000,10.870},
				{8262.424,1955.696,10.000,11.180},
				{8457.994,1955.696,10.000,11.490},
				{8653.563,1955.696,10.000,11.790},
				{8849.133,1955.696,10.000,12.080},
				{9044.703,1955.696,10.000,12.370},
				{9240.272,1955.696,10.000,12.650},
				{9435.842,1955.696,10.000,12.920},
				{9631.411,1955.696,10.000,13.180},
				{9826.981,1955.696,10.000,13.440},
				{10022.551,1955.696,10.000,13.680},
				{10218.120,1955.696,10.000,13.920},
				{10413.690,1955.696,10.000,14.150},
				{10609.259,1955.696,10.000,14.370},
				{10804.829,1955.696,10.000,14.570},
				{11000.399,1955.696,10.000,14.770},
				{11195.968,1955.696,10.000,14.960},
				{11391.538,1955.696,10.000,15.140},
				{11587.107,1955.696,10.000,15.310},
				{11782.677,1955.696,10.000,15.460},
				{11978.246,1955.696,10.000,15.610},
				{12173.816,1955.696,10.000,15.740},
				{12369.386,1955.696,10.000,15.870},
				{12564.955,1955.696,10.000,15.980},
				{12760.525,1955.696,10.000,16.080},
				{12956.094,1955.696,10.000,16.170},
				{13151.664,1955.696,10.000,16.250},
				{13347.234,1955.696,10.000,16.320},
				{13542.803,1955.696,10.000,16.370},
				{13738.373,1955.696,10.000,16.410},
				{13933.942,1955.696,10.000,16.440},
				{14129.512,1955.696,10.000,16.460},
				{14325.082,1955.696,10.000,16.470},
				{14520.651,1955.696,10.000,16.460},
				{14716.221,1955.696,10.000,16.440},
				{14911.790,1955.696,10.000,16.410},
				{15107.360,1955.696,10.000,16.370},
				{15302.930,1955.696,10.000,16.310},
				{15498.499,1955.696,10.000,16.240},
				{15694.069,1955.696,10.000,16.160},
				{15889.638,1955.696,10.000,16.060},
				{16085.208,1955.696,10.000,15.950},
				{16280.778,1955.696,10.000,15.830},
				{16476.347,1955.696,10.000,15.690},
				{16671.917,1955.696,10.000,15.540},
				{16867.486,1955.696,10.000,15.370},
				{17063.056,1955.696,10.000,15.200},
				{17258.626,1955.696,10.000,15.000},
				{17454.195,1955.696,10.000,14.800},
				{17649.765,1955.696,10.000,14.580},
				{17845.334,1955.696,10.000,14.340},
				{18040.904,1955.696,10.000,14.100},
				{18236.474,1955.696,10.000,13.830},
				{18432.043,1955.696,10.000,13.550},
				{18627.613,1955.696,10.000,13.260},
				{18823.182,1955.696,10.000,12.960},
				{19018.752,1955.696,10.000,12.640},
				{19214.321,1955.696,10.000,12.300},
				{19409.891,1955.696,10.000,11.950},
				{19605.461,1955.696,10.000,11.580},
				{19801.030,1955.696,10.000,11.200},
				{19996.600,1955.696,10.000,10.810},
				{20192.169,1955.696,10.000,10.400},
				{20387.739,1955.696,10.000,9.970},
				{20583.309,1955.696,10.000,9.540},
				{20778.878,1955.696,10.000,9.080},
				{20974.448,1955.696,10.000,8.610},
				{21170.017,1955.696,10.000,8.130},
				{21365.587,1955.696,10.000,7.640},
				{21561.157,1955.696,10.000,7.130},
				{21756.726,1955.696,10.000,6.600},
				{21952.296,1955.696,10.000,6.070},
				{22147.865,1955.696,10.000,5.520},
				{22343.435,1955.696,10.000,4.950},
				{22539.005,1955.696,10.000,4.380},
				{22734.574,1955.696,10.000,3.790},
				{22930.144,1955.696,10.000,3.190},
				{23125.713,1955.696,10.000,2.580},
				{23321.283,1955.696,10.000,1.960},
				{23516.853,1955.696,10.000,1.330},
				{23712.422,1955.696,10.000,0.690},
				{23907.992,1955.696,10.000,0.040},
				{24103.561,1955.696,10.000,-0.610},
				{24299.131,1955.696,10.000,-1.280},
				{24494.701,1955.696,10.000,-1.950},
				{24690.270,1955.696,10.000,-2.630},
				{24885.840,1955.696,10.000,-3.310},
				{25081.409,1955.696,10.000,-4.000},
				{25276.979,1955.696,10.000,-4.690},
				{25472.548,1955.696,10.000,-5.380},
				{25668.118,1955.696,10.000,-6.080},
				{25863.688,1955.696,10.000,-6.770},
				{26059.257,1955.696,10.000,-7.470},
				{26254.827,1955.696,10.000,-8.170},
				{26450.396,1955.696,10.000,-8.870},
				{26645.966,1955.696,10.000,-9.560},
				{26841.536,1955.696,10.000,-10.250},
				{27037.105,1955.696,10.000,-10.940},
				{27232.675,1955.696,10.000,-11.620},
				{27428.244,1955.696,10.000,-12.300},
				{27623.814,1955.696,10.000,-12.970},
				{27819.384,1955.696,10.000,-13.630},
				{28014.953,1955.696,10.000,-14.290},
				{28210.523,1955.696,10.000,-14.940},
				{28406.092,1955.696,10.000,-15.580},
				{28601.662,1955.696,10.000,-16.210},
				{28797.232,1955.696,10.000,-16.840},
				{28992.801,1955.696,10.000,-17.450},
				{29188.371,1955.696,10.000,-18.050},
				{29383.940,1955.696,10.000,-18.630},
				{29579.510,1955.696,10.000,-19.210},
				{29775.080,1955.696,10.000,-19.780},
				{29970.649,1955.696,10.000,-20.330},
				{30166.219,1955.696,10.000,-20.870},
				{30361.788,1955.696,10.000,-21.390},
				{30557.358,1955.696,10.000,-21.900},
				{30752.928,1955.696,10.000,-22.400},
				{30948.497,1955.696,10.000,-22.880},
				{31144.067,1955.696,10.000,-23.350},
				{31339.636,1955.696,10.000,-23.810},
				{31535.206,1955.696,10.000,-24.250},
				{31730.775,1955.696,10.000,-24.670},
				{31926.345,1955.696,10.000,-25.080},
				{32121.915,1955.696,10.000,-25.480},
				{32317.484,1955.696,10.000,-25.860},
				{32513.054,1955.696,10.000,-26.220},
				{32708.623,1955.696,10.000,-26.570},
				{32901.064,1924.405,10.000,-26.900},
				{33090.375,1893.114,10.000,-27.200},
				{33276.558,1861.823,10.000,-27.490},
				{33459.611,1830.531,10.000,-27.760},
				{33639.535,1799.240,10.000,-28.010},
				{33816.330,1767.949,10.000,-28.240},
				{33989.995,1736.658,10.000,-28.450},
				{34160.532,1705.367,10.000,-28.650},
				{34327.940,1674.076,10.000,-28.830},
				{34492.218,1642.785,10.000,-29.000},
				{34653.368,1611.493,10.000,-29.150},
				{34811.388,1580.202,10.000,-29.290},
				{34966.279,1548.911,10.000,-29.410},
				{35118.041,1517.620,10.000,-29.520},
				{35266.674,1486.329,10.000,-29.610},
				{35412.178,1455.038,10.000,-29.700},
				{35554.552,1423.747,10.000,-29.770},
				{35693.798,1392.456,10.000,-29.830},
				{35829.914,1361.164,10.000,-29.890},
				{35962.902,1329.873,10.000,-29.930},
				{36092.760,1298.582,10.000,-29.960},
				{36219.489,1267.291,10.000,-29.980},
				{36343.089,1236.000,10.000,-29.990},
				{36343.089,1236.000,10.000,-29.990},
				{36469.818,1267.291,10.000,-30.000},
				{36599.676,1298.582,10.000,-30.000},
				{36732.663,1329.873,10.000,-29.990},
				{36868.780,1361.164,10.000,-29.990},
				{37008.025,1392.456,10.000,-29.970},
				{37150.400,1423.747,10.000,-29.960},
				{37295.904,1455.038,10.000,-29.940},
				{37444.537,1486.329,10.000,-29.910},
				{37596.299,1517.620,10.000,-29.880},
				{37751.190,1548.911,10.000,-29.840},
				{37909.210,1580.202,10.000,-29.800},
				{38070.359,1611.493,10.000,-29.760},
				{38234.638,1642.785,10.000,-29.710},
				{38402.045,1674.076,10.000,-29.650},
				{38572.582,1705.367,10.000,-29.580},
				{38746.248,1736.658,10.000,-29.510},
				{38923.043,1767.949,10.000,-29.430},
				{39102.967,1799.240,10.000,-29.350},
				{39286.020,1830.531,10.000,-29.250},
				{39472.202,1861.823,10.000,-29.150},
				{39661.514,1893.114,10.000,-29.040},
				{39853.954,1924.405,10.000,-28.920},
				{40049.524,1955.696,10.000,-28.790},
				{40245.093,1955.696,10.000,-28.660},
				{40440.663,1955.696,10.000,-28.510},
				{40636.233,1955.696,10.000,-28.360},
				{40831.802,1955.696,10.000,-28.210},
				{41027.372,1955.696,10.000,-28.040},
				{41222.941,1955.696,10.000,-27.870},
				{41418.511,1955.696,10.000,-27.690},
				{41614.081,1955.696,10.000,-27.500},
				{41809.650,1955.696,10.000,-27.300},
				{42005.220,1955.696,10.000,-27.090},
				{42200.789,1955.696,10.000,-26.880},
				{42396.359,1955.696,10.000,-26.660},
				{42591.928,1955.696,10.000,-26.420},
				{42787.498,1955.696,10.000,-26.180},
				{42983.068,1955.696,10.000,-25.930},
				{43178.637,1955.696,10.000,-25.680},
				{43374.207,1955.696,10.000,-25.410},
				{43569.776,1955.696,10.000,-25.130},
				{43765.346,1955.696,10.000,-24.840},
				{43960.916,1955.696,10.000,-24.540},
				{44156.485,1955.696,10.000,-24.230},
				{44352.055,1955.696,10.000,-23.910},
				{44547.624,1955.696,10.000,-23.580},
				{44743.194,1955.696,10.000,-23.240},
				{44938.764,1955.696,10.000,-22.890},
				{45134.333,1955.696,10.000,-22.520},
				{45329.903,1955.696,10.000,-22.140},
				{45525.472,1955.696,10.000,-21.750},
				{45721.042,1955.696,10.000,-21.350},
				{45916.612,1955.696,10.000,-20.940},
				{46112.181,1955.696,10.000,-20.510},
				{46307.751,1955.696,10.000,-20.060},
				{46503.320,1955.696,10.000,-19.610},
				{46698.890,1955.696,10.000,-19.130},
				{46894.460,1955.696,10.000,-18.650},
				{47090.029,1955.696,10.000,-18.140},
				{47285.599,1955.696,10.000,-17.620},
				{47481.168,1955.696,10.000,-17.090},
				{47676.738,1955.696,10.000,-16.540},
				{47872.308,1955.696,10.000,-15.970},
				{48067.877,1955.696,10.000,-15.380},
				{48263.447,1955.696,10.000,-14.780},
				{48459.016,1955.696,10.000,-14.160},
				{48654.586,1955.696,10.000,-13.520},
				{48850.155,1955.696,10.000,-12.860},
				{49045.725,1955.696,10.000,-12.180},
				{49241.295,1955.696,10.000,-11.480},
				{49436.864,1955.696,10.000,-10.760},
				{49632.434,1955.696,10.000,-10.020},
				{49828.003,1955.696,10.000,-9.260},
				{50023.573,1955.696,10.000,-8.480},
				{50219.143,1955.696,10.000,-7.680},
				{50414.712,1955.696,10.000,-6.850},
				{50610.282,1955.696,10.000,-6.010},
				{50805.851,1955.696,10.000,-5.150},
				{51001.421,1955.696,10.000,-4.260},
				{51196.991,1955.696,10.000,-3.350},
				{51392.560,1955.696,10.000,-2.420},
				{51588.130,1955.696,10.000,-1.480},
				{51783.699,1955.696,10.000,-0.510},
				{51979.269,1955.696,10.000,0.480},
				{52174.839,1955.696,10.000,1.490},
				{52370.408,1955.696,10.000,2.510},
				{52565.978,1955.696,10.000,3.550},
				{52761.547,1955.696,10.000,4.610},
				{52957.117,1955.696,10.000,5.680},
				{53152.687,1955.696,10.000,6.760},
				{53348.256,1955.696,10.000,7.860},
				{53543.826,1955.696,10.000,8.970},
				{53739.395,1955.696,10.000,10.090},
				{53934.965,1955.696,10.000,11.210},
				{54130.535,1955.696,10.000,12.340},
				{54326.104,1955.696,10.000,13.480},
				{54521.674,1955.696,10.000,14.620},
				{54717.243,1955.696,10.000,15.760},
				{54912.813,1955.696,10.000,16.890},
				{55108.382,1955.696,10.000,18.030},
				{55303.952,1955.696,10.000,19.160},
				{55499.522,1955.696,10.000,20.280},
				{55695.091,1955.696,10.000,21.400},
				{55890.661,1955.696,10.000,22.510},
				{56086.230,1955.696,10.000,23.600},
				{56281.800,1955.696,10.000,24.680},
				{56477.370,1955.696,10.000,25.750},
				{56672.939,1955.696,10.000,26.800},
				{56868.509,1955.696,10.000,27.840},
				{57064.078,1955.696,10.000,28.860},
				{57259.648,1955.696,10.000,29.860},
				{57455.218,1955.696,10.000,30.840},
				{57650.787,1955.696,10.000,31.800},
				{57846.357,1955.696,10.000,32.740},
				{58041.926,1955.696,10.000,33.660},
				{58237.496,1955.696,10.000,34.560},
				{58433.066,1955.696,10.000,35.440},
				{58628.635,1955.696,10.000,36.290},
				{58824.205,1955.696,10.000,37.130},
				{59019.774,1955.696,10.000,37.940},
				{59215.344,1955.696,10.000,38.730},
				{59410.914,1955.696,10.000,39.500},
				{59606.483,1955.696,10.000,40.240},
				{59802.053,1955.696,10.000,40.970},
				{59997.622,1955.696,10.000,41.680},
				{60193.192,1955.696,10.000,42.360},
				{60388.762,1955.696,10.000,43.020},
				{60584.331,1955.696,10.000,43.670},
				{60779.901,1955.696,10.000,44.290},
				{60975.470,1955.696,10.000,44.900},
				{61171.040,1955.696,10.000,45.490},
				{61366.610,1955.696,10.000,46.050},
				{61562.179,1955.696,10.000,46.600},
				{61757.749,1955.696,10.000,47.140},
				{61953.318,1955.696,10.000,47.650},
				{62148.888,1955.696,10.000,48.150},
				{62344.457,1955.696,10.000,48.640},
				{62540.027,1955.696,10.000,49.100},
				{62735.597,1955.696,10.000,49.560},
				{62931.166,1955.696,10.000,49.990},
				{63126.736,1955.696,10.000,50.420},
				{63322.305,1955.696,10.000,50.830},
				{63517.875,1955.696,10.000,51.220},
				{63713.445,1955.696,10.000,51.600},
				{63909.014,1955.696,10.000,51.970},
				{64104.584,1955.696,10.000,52.330},
				{64300.153,1955.696,10.000,52.670},
				{64495.723,1955.696,10.000,53.010},
				{64691.293,1955.696,10.000,53.330},
				{64886.862,1955.696,10.000,53.640},
				{65082.432,1955.696,10.000,53.940},
				{65278.001,1955.696,10.000,54.230},
				{65473.571,1955.696,10.000,54.510},
				{65669.141,1955.696,10.000,54.770},
				{65864.710,1955.696,10.000,55.030},
				{66060.280,1955.696,10.000,55.280},
				{66255.849,1955.696,10.000,55.520},
				{66451.419,1955.696,10.000,55.760},
				{66646.989,1955.696,10.000,55.980},
				{66842.558,1955.696,10.000,56.190},
				{67038.128,1955.696,10.000,56.400},
				{67233.697,1955.696,10.000,56.600},
				{67429.267,1955.696,10.000,56.790},
				{67624.837,1955.696,10.000,56.970},
				{67820.406,1955.696,10.000,57.150},
				{68015.976,1955.696,10.000,57.320},
				{68211.545,1955.696,10.000,57.480},
				{68407.115,1955.696,10.000,57.640},
				{68602.684,1955.696,10.000,57.790},
				{68798.254,1955.696,10.000,57.930},
				{68993.824,1955.696,10.000,58.070},
				{69189.393,1955.696,10.000,58.200},
				{69384.963,1955.696,10.000,58.320},
				{69580.532,1955.696,10.000,58.440},
				{69776.102,1955.696,10.000,58.550},
				{69971.672,1955.696,10.000,58.660},
				{70167.241,1955.696,10.000,58.770},
				{70362.811,1955.696,10.000,58.860},
				{70558.380,1955.696,10.000,58.960},
				{70753.950,1955.696,10.000,59.050},
				{70949.520,1955.696,10.000,59.130},
				{71145.089,1955.696,10.000,59.210},
				{71340.659,1955.696,10.000,59.280},
				{71533.099,1924.405,10.000,59.350},
				{71722.411,1893.114,10.000,59.420},
				{71908.593,1861.823,10.000,59.480},
				{72091.646,1830.531,10.000,59.530},
				{72271.570,1799.240,10.000,59.580},
				{72448.365,1767.949,10.000,59.630},
				{72622.031,1736.658,10.000,59.670},
				{72792.567,1705.367,10.000,59.710},
				{72959.975,1674.076,10.000,59.750},
				{73124.254,1642.785,10.000,59.780},
				{73285.403,1611.493,10.000,59.820},
				{73443.423,1580.202,10.000,59.840},
				{73598.314,1548.911,10.000,59.870},
				{73750.076,1517.620,10.000,59.890},
				{73898.709,1486.329,10.000,59.920},
				{74044.213,1455.038,10.000,59.940},
				{74186.588,1423.747,10.000,59.950},
				{74325.833,1392.456,10.000,59.970},
				{74461.950,1361.164,10.000,59.980},
				{74594.937,1329.873,10.000,60.000},
				{74724.795,1298.582,10.000,60.010},
				{74851.524,1267.291,10.000,60.020},
				{74975.124,1236.000,10.000,60.030},
				{75095.595,1204.709,10.000,60.040},
				{75212.937,1173.418,10.000,60.050},
				{75327.149,1142.126,10.000,60.050},
				{75438.233,1110.835,10.000,60.060},
				{75546.187,1079.544,10.000,60.070},
				{75651.013,1048.253,10.000,60.070},
				{75752.709,1016.962,10.000,60.070},
				{75851.276,985.671,10.000,60.080},
				{75946.714,954.380,10.000,60.080},
				{76039.023,923.088,10.000,60.080},
				{76128.202,891.797,10.000,60.090},
				{76214.253,860.506,10.000,60.090},
				{76297.175,829.215,10.000,60.090},
				{76376.967,797.924,10.000,60.090},
				{76453.630,766.633,10.000,60.090},
				{76527.164,735.342,10.000,60.090},
				{76597.569,704.051,10.000,60.100},
				{76664.845,672.759,10.000,60.100},
				{76728.992,641.468,10.000,60.100},
				{76790.010,610.177,10.000,60.100},
				{76847.899,578.886,10.000,60.100},
				{76902.658,547.595,10.000,60.100},
				{76954.288,516.304,10.000,60.100},
				{77002.790,485.013,10.000,60.100},
				{77048.162,453.721,10.000,60.100},
				{77090.405,422.430,10.000,60.100},
				{77129.519,391.139,10.000,60.100},
				{77165.504,359.848,10.000,60.100},
				{77198.359,328.557,10.000,60.100},
				{77228.086,297.266,10.000,60.100},
				{77254.683,265.975,10.000,60.100},
				{77278.152,234.684,10.000,60.100},
				{77298.491,203.392,10.000,60.100},
				{77315.701,172.101,10.000,60.100},
				{77329.782,140.810,10.000,60.100},
				{77340.734,109.519,10.000,60.100},
				{77348.557,78.228,10.000,60.100},
				{77353.250,46.937,10.000,60.100}		};

}