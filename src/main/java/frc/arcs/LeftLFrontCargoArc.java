package frc.arcs;

import com.team319.follower.SrxMotionProfile;
import com.team319.follower.SrxTrajectory;

public class LeftLFrontCargoArc extends SrxTrajectory {
	
	// WAYPOINTS:
	// (X,Y,degrees)
	// (5.30,17.00,0.00)
	// (10.30,14.00,0.00)
	// (14.30,14.50,0.00)
	
    public LeftLFrontCargoArc() {
		super();
		this.highGear = true;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	
    public LeftLFrontCargoArc(boolean flipped) {
		super();
		this.highGear = true;
		this.flipped = flipped;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	public boolean highGear = true;

	double[][] centerPoints = {
				{0.000,0.000,10.000,0.000},
				{2.086,20.861,10.000,0.000},
				{6.258,41.722,10.000,0.000},
				{12.516,62.582,10.000,0.000},
				{20.861,83.443,10.000,0.000},
				{31.291,104.304,10.000,0.000},
				{43.808,125.165,10.000,0.000},
				{58.410,146.025,10.000,0.010},
				{75.099,166.886,10.000,0.010},
				{93.873,187.747,10.000,0.020},
				{114.734,208.608,10.000,0.030},
				{137.681,229.468,10.000,0.050},
				{162.714,250.329,10.000,0.060},
				{189.833,271.190,10.000,0.090},
				{219.038,292.051,10.000,0.110},
				{250.329,312.911,10.000,0.150},
				{283.706,333.772,10.000,0.190},
				{319.170,354.633,10.000,0.240},
				{356.719,375.494,10.000,0.300},
				{396.354,396.354,10.000,0.360},
				{438.076,417.215,10.000,0.440},
				{481.883,438.076,10.000,0.530},
				{527.777,458.937,10.000,0.640},
				{575.757,479.797,10.000,0.760},
				{625.823,500.658,10.000,0.890},
				{677.975,521.519,10.000,1.040},
				{732.213,542.380,10.000,1.210},
				{788.537,563.240,10.000,1.400},
				{846.947,584.101,10.000,1.610},
				{907.443,604.962,10.000,1.840},
				{970.025,625.823,10.000,2.100},
				{1034.694,646.683,10.000,2.380},
				{1101.448,667.544,10.000,2.690},
				{1170.288,688.405,10.000,3.030},
				{1241.215,709.266,10.000,3.400},
				{1314.228,730.126,10.000,3.800},
				{1389.326,750.987,10.000,4.230},
				{1466.511,771.848,10.000,4.700},
				{1545.782,792.709,10.000,5.210},
				{1627.139,813.570,10.000,5.760},
				{1710.582,834.430,10.000,6.360},
				{1796.111,855.291,10.000,6.990},
				{1883.726,876.152,10.000,7.680},
				{1973.428,897.013,10.000,8.410},
				{2065.215,917.873,10.000,9.190},
				{2159.088,938.734,10.000,10.030},
				{2255.048,959.595,10.000,10.920},
				{2353.093,980.456,10.000,11.870},
				{2453.225,1001.316,10.000,12.870},
				{2555.443,1022.177,10.000,13.930},
				{2659.746,1043.038,10.000,15.060},
				{2766.136,1063.899,10.000,16.240},
				{2874.612,1084.759,10.000,17.490},
				{2985.174,1105.620,10.000,18.790},
				{3097.822,1126.481,10.000,20.150},
				{3212.557,1147.342,10.000,21.560},
				{3329.377,1168.202,10.000,23.030},
				{3448.283,1189.063,10.000,24.550},
				{3569.275,1209.924,10.000,26.100},
				{3692.354,1230.785,10.000,27.690},
				{3817.518,1251.645,10.000,29.320},
				{3944.769,1272.506,10.000,30.960},
				{4074.106,1293.367,10.000,32.610},
				{4205.529,1314.228,10.000,34.270},
				{4339.037,1335.088,10.000,35.930},
				{4474.632,1355.949,10.000,37.570},
				{4612.313,1376.810,10.000,39.180},
				{4752.080,1397.671,10.000,40.770},
				{4893.934,1418.531,10.000,42.310},
				{5037.873,1439.392,10.000,43.810},
				{5183.898,1460.253,10.000,45.260},
				{5332.009,1481.114,10.000,46.650},
				{5482.207,1501.974,10.000,47.970},
				{5634.490,1522.835,10.000,49.220},
				{5788.860,1543.696,10.000,50.410},
				{5945.316,1564.557,10.000,51.520},
				{6101.771,1564.557,10.000,52.540},
				{6258.227,1564.557,10.000,53.470},
				{6414.683,1564.557,10.000,54.320},
				{6571.138,1564.557,10.000,55.090},
				{6727.594,1564.557,10.000,55.780},
				{6884.050,1564.557,10.000,56.390},
				{7040.505,1564.557,10.000,56.920},
				{7196.961,1564.557,10.000,57.380},
				{7353.417,1564.557,10.000,57.770},
				{7509.872,1564.557,10.000,58.080},
				{7666.328,1564.557,10.000,58.330},
				{7822.784,1564.557,10.000,58.510},
				{7979.239,1564.557,10.000,58.620},
				{8135.695,1564.557,10.000,58.660},
				{8292.151,1564.557,10.000,58.640},
				{8448.606,1564.557,10.000,58.550},
				{8605.062,1564.557,10.000,58.390},
				{8761.518,1564.557,10.000,58.160},
				{8917.973,1564.557,10.000,57.870},
				{9074.429,1564.557,10.000,57.500},
				{9230.885,1564.557,10.000,57.060},
				{9387.341,1564.557,10.000,56.550},
				{9543.796,1564.557,10.000,55.960},
				{9700.252,1564.557,10.000,55.300},
				{9856.708,1564.557,10.000,54.550},
				{10013.163,1564.557,10.000,53.730},
				{10169.619,1564.557,10.000,52.820},
				{10326.075,1564.557,10.000,51.820},
				{10482.530,1564.557,10.000,50.730},
				{10638.986,1564.557,10.000,49.560},
				{10795.442,1564.557,10.000,48.290},
				{10951.897,1564.557,10.000,46.940},
				{11108.353,1564.557,10.000,45.490},
				{11264.809,1564.557,10.000,43.950},
				{11421.264,1564.557,10.000,42.320},
				{11577.720,1564.557,10.000,40.620},
				{11734.176,1564.557,10.000,38.830},
				{11890.631,1564.557,10.000,36.980},
				{12047.087,1564.557,10.000,35.060},
				{12201.457,1543.696,10.000,33.130},
				{12353.740,1522.835,10.000,31.180},
				{12503.938,1501.974,10.000,29.250},
				{12652.049,1481.114,10.000,27.330},
				{12798.074,1460.253,10.000,25.440},
				{12942.013,1439.392,10.000,23.600},
				{13083.867,1418.531,10.000,21.810},
				{13223.634,1397.671,10.000,20.080},
				{13361.315,1376.810,10.000,18.430},
				{13496.910,1355.949,10.000,16.850},
				{13630.418,1335.088,10.000,15.340},
				{13761.841,1314.228,10.000,13.920},
				{13891.178,1293.367,10.000,12.580},
				{14018.429,1272.506,10.000,11.320},
				{14143.593,1251.645,10.000,10.150},
				{14266.672,1230.785,10.000,9.050},
				{14387.664,1209.924,10.000,8.040},
				{14506.570,1189.063,10.000,7.090},
				{14623.390,1168.202,10.000,6.230},
				{14738.125,1147.342,10.000,5.430},
				{14850.773,1126.481,10.000,4.700},
				{14961.335,1105.620,10.000,4.030},
				{15069.811,1084.759,10.000,3.420},
				{15176.200,1063.899,10.000,2.880},
				{15280.504,1043.038,10.000,2.390},
				{15382.722,1022.177,10.000,1.950},
				{15482.854,1001.316,10.000,1.560},
				{15580.899,980.456,10.000,1.220},
				{15676.859,959.595,10.000,0.930},
				{15770.732,938.734,10.000,0.680},
				{15862.519,917.873,10.000,0.470},
				{15952.221,897.013,10.000,0.310},
				{16039.836,876.152,10.000,0.180},
				{16125.365,855.291,10.000,0.090},
				{16208.808,834.430,10.000,0.030},
				{16290.165,813.570,10.000,0.000},
				{16290.165,813.570,10.000,0.000},
				{16373.608,834.430,10.000,-0.010},
				{16459.137,855.291,10.000,-0.040},
				{16546.752,876.152,10.000,-0.100},
				{16636.453,897.013,10.000,-0.180},
				{16728.241,917.873,10.000,-0.300},
				{16822.114,938.734,10.000,-0.440},
				{16918.074,959.595,10.000,-0.610},
				{17016.119,980.456,10.000,-0.810},
				{17116.251,1001.316,10.000,-1.040},
				{17218.469,1022.177,10.000,-1.290},
				{17322.772,1043.038,10.000,-1.570},
				{17429.162,1063.899,10.000,-1.880},
				{17537.638,1084.759,10.000,-2.220},
				{17648.200,1105.620,10.000,-2.580},
				{17760.848,1126.481,10.000,-2.960},
				{17875.582,1147.342,10.000,-3.370},
				{17992.403,1168.202,10.000,-3.790},
				{18111.309,1189.063,10.000,-4.240},
				{18232.301,1209.924,10.000,-4.700},
				{18355.380,1230.785,10.000,-5.180},
				{18480.544,1251.645,10.000,-5.670},
				{18607.795,1272.506,10.000,-6.170},
				{18737.132,1293.367,10.000,-6.680},
				{18867.511,1303.797,10.000,-7.190},
				{18997.891,1303.797,10.000,-7.690},
				{19128.271,1303.797,10.000,-8.180},
				{19258.651,1303.797,10.000,-8.660},
				{19389.030,1303.797,10.000,-9.130},
				{19519.410,1303.797,10.000,-9.570},
				{19649.790,1303.797,10.000,-10.010},
				{19780.170,1303.797,10.000,-10.420},
				{19910.549,1303.797,10.000,-10.810},
				{20040.929,1303.797,10.000,-11.170},
				{20171.309,1303.797,10.000,-11.520},
				{20301.688,1303.797,10.000,-11.830},
				{20432.068,1303.797,10.000,-12.120},
				{20562.448,1303.797,10.000,-12.380},
				{20692.828,1303.797,10.000,-12.610},
				{20823.207,1303.797,10.000,-12.810},
				{20953.587,1303.797,10.000,-12.990},
				{21083.967,1303.797,10.000,-13.130},
				{21214.347,1303.797,10.000,-13.230},
				{21344.726,1303.797,10.000,-13.310},
				{21475.106,1303.797,10.000,-13.350},
				{21605.486,1303.797,10.000,-13.370},
				{21735.865,1303.797,10.000,-13.350},
				{21866.245,1303.797,10.000,-13.290},
				{21996.625,1303.797,10.000,-13.210},
				{22127.005,1303.797,10.000,-13.090},
				{22257.384,1303.797,10.000,-12.950},
				{22387.764,1303.797,10.000,-12.770},
				{22518.144,1303.797,10.000,-12.560},
				{22648.524,1303.797,10.000,-12.320},
				{22778.903,1303.797,10.000,-12.050},
				{22909.283,1303.797,10.000,-11.760},
				{23037.577,1282.937,10.000,-11.440},
				{23163.784,1262.076,10.000,-11.100},
				{23287.906,1241.215,10.000,-10.750},
				{23409.941,1220.354,10.000,-10.380},
				{23529.891,1199.494,10.000,-10.000},
				{23647.754,1178.633,10.000,-9.610},
				{23763.531,1157.772,10.000,-9.220},
				{23877.222,1136.911,10.000,-8.810},
				{23988.827,1116.050,10.000,-8.410},
				{24098.346,1095.190,10.000,-8.000},
				{24205.779,1074.329,10.000,-7.590},
				{24311.126,1053.468,10.000,-7.190},
				{24414.387,1032.607,10.000,-6.790},
				{24515.561,1011.747,10.000,-6.390},
				{24614.650,990.886,10.000,-6.000},
				{24711.652,970.025,10.000,-5.620},
				{24806.569,949.164,10.000,-5.250},
				{24899.399,928.304,10.000,-4.890},
				{24990.143,907.443,10.000,-4.540},
				{25078.802,886.582,10.000,-4.200},
				{25165.374,865.721,10.000,-3.870},
				{25249.860,844.861,10.000,-3.560},
				{25332.260,824.000,10.000,-3.260},
				{25412.574,803.139,10.000,-2.980},
				{25490.802,782.278,10.000,-2.710},
				{25566.943,761.418,10.000,-2.460},
				{25640.999,740.557,10.000,-2.220},
				{25712.969,719.696,10.000,-1.990},
				{25782.852,698.835,10.000,-1.780},
				{25850.650,677.975,10.000,-1.590},
				{25916.361,657.114,10.000,-1.410},
				{25979.986,636.253,10.000,-1.240},
				{26041.526,615.392,10.000,-1.090},
				{26100.979,594.532,10.000,-0.950},
				{26158.346,573.671,10.000,-0.820},
				{26213.627,552.810,10.000,-0.700},
				{26266.822,531.949,10.000,-0.600},
				{26317.931,511.089,10.000,-0.500},
				{26366.953,490.228,10.000,-0.420},
				{26413.890,469.367,10.000,-0.350},
				{26458.741,448.506,10.000,-0.280},
				{26501.505,427.646,10.000,-0.230},
				{26542.184,406.785,10.000,-0.180},
				{26580.776,385.924,10.000,-0.140},
				{26617.283,365.063,10.000,-0.110},
				{26651.703,344.202,10.000,-0.080},
				{26684.037,323.342,10.000,-0.060},
				{26714.285,302.481,10.000,-0.040},
				{26742.447,281.620,10.000,-0.030},
				{26768.523,260.759,10.000,-0.020},
				{26792.513,239.899,10.000,-0.010},
				{26814.417,219.038,10.000,0.000},
				{26834.234,198.177,10.000,0.000},
				{26851.966,177.316,10.000,0.000},
				{26867.612,156.456,10.000,0.000},
				{26881.171,135.595,10.000,0.000},
				{26892.645,114.734,10.000,0.000},
				{26902.032,93.873,10.000,0.000},
				{26909.333,73.013,10.000,0.000},
				{26914.548,52.152,10.000,0.000}		};

}