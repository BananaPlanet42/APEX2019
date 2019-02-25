package frc.arcs;

import com.team319.follower.SrxMotionProfile;
import com.team319.follower.SrxTrajectory;

public class CenterSideCargoArc extends SrxTrajectory {
	
	// WAYPOINTS:
	// (X,Y,degrees)
	// (5.30,13.50,0.00)
	// (11.30,13.00,0.00)
	// (15.30,12.50,0.00)
	
    public CenterSideCargoArc() {
		super();
		this.highGear = true;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	
    public CenterSideCargoArc(boolean flipped) {
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
				{58.410,146.025,10.000,0.000},
				{75.099,166.886,10.000,0.000},
				{93.873,187.747,10.000,0.000},
				{114.734,208.608,10.000,0.010},
				{137.681,229.468,10.000,0.010},
				{162.714,250.329,10.000,0.010},
				{189.833,271.190,10.000,0.020},
				{219.038,292.051,10.000,0.030},
				{250.329,312.911,10.000,0.030},
				{283.706,333.772,10.000,0.040},
				{319.170,354.633,10.000,0.060},
				{356.719,375.494,10.000,0.070},
				{396.354,396.354,10.000,0.090},
				{438.076,417.215,10.000,0.100},
				{481.883,438.076,10.000,0.130},
				{527.777,458.937,10.000,0.150},
				{575.757,479.797,10.000,0.180},
				{625.823,500.658,10.000,0.210},
				{677.975,521.519,10.000,0.240},
				{732.213,542.380,10.000,0.280},
				{788.537,563.240,10.000,0.320},
				{846.947,584.101,10.000,0.370},
				{907.443,604.962,10.000,0.420},
				{970.025,625.823,10.000,0.480},
				{1034.694,646.683,10.000,0.540},
				{1101.448,667.544,10.000,0.600},
				{1170.288,688.405,10.000,0.670},
				{1241.215,709.266,10.000,0.750},
				{1314.228,730.126,10.000,0.830},
				{1389.326,750.987,10.000,0.920},
				{1466.511,771.848,10.000,1.020},
				{1544.739,782.278,10.000,1.120},
				{1622.967,782.278,10.000,1.220},
				{1701.195,782.278,10.000,1.320},
				{1779.423,782.278,10.000,1.430},
				{1857.650,782.278,10.000,1.540},
				{1935.878,782.278,10.000,1.660},
				{2014.106,782.278,10.000,1.780},
				{2092.334,782.278,10.000,1.890},
				{2170.562,782.278,10.000,2.020},
				{2248.790,782.278,10.000,2.140},
				{2327.017,782.278,10.000,2.260},
				{2405.245,782.278,10.000,2.390},
				{2483.473,782.278,10.000,2.520},
				{2561.701,782.278,10.000,2.650},
				{2639.929,782.278,10.000,2.780},
				{2718.157,782.278,10.000,2.920},
				{2796.384,782.278,10.000,3.050},
				{2874.612,782.278,10.000,3.180},
				{2952.840,782.278,10.000,3.320},
				{3031.068,782.278,10.000,3.460},
				{3109.296,782.278,10.000,3.590},
				{3187.524,782.278,10.000,3.730},
				{3265.751,782.278,10.000,3.870},
				{3343.979,782.278,10.000,4.000},
				{3422.207,782.278,10.000,4.140},
				{3500.435,782.278,10.000,4.280},
				{3578.663,782.278,10.000,4.410},
				{3656.891,782.278,10.000,4.550},
				{3735.118,782.278,10.000,4.690},
				{3813.346,782.278,10.000,4.820},
				{3891.574,782.278,10.000,4.960},
				{3969.802,782.278,10.000,5.090},
				{4048.030,782.278,10.000,5.220},
				{4126.258,782.278,10.000,5.360},
				{4204.486,782.278,10.000,5.490},
				{4282.713,782.278,10.000,5.620},
				{4360.941,782.278,10.000,5.740},
				{4439.169,782.278,10.000,5.870},
				{4517.397,782.278,10.000,6.000},
				{4595.625,782.278,10.000,6.120},
				{4673.853,782.278,10.000,6.240},
				{4752.080,782.278,10.000,6.360},
				{4830.308,782.278,10.000,6.480},
				{4908.536,782.278,10.000,6.590},
				{4986.764,782.278,10.000,6.710},
				{5064.992,782.278,10.000,6.820},
				{5143.220,782.278,10.000,6.930},
				{5221.447,782.278,10.000,7.040},
				{5299.675,782.278,10.000,7.140},
				{5377.903,782.278,10.000,7.240},
				{5456.131,782.278,10.000,7.340},
				{5534.359,782.278,10.000,7.440},
				{5612.587,782.278,10.000,7.540},
				{5690.814,782.278,10.000,7.630},
				{5769.042,782.278,10.000,7.720},
				{5847.270,782.278,10.000,7.800},
				{5925.498,782.278,10.000,7.890},
				{6003.726,782.278,10.000,7.970},
				{6081.954,782.278,10.000,8.050},
				{6160.181,782.278,10.000,8.120},
				{6238.409,782.278,10.000,8.190},
				{6316.637,782.278,10.000,8.260},
				{6394.865,782.278,10.000,8.330},
				{6473.093,782.278,10.000,8.390},
				{6551.321,782.278,10.000,8.450},
				{6629.548,782.278,10.000,8.500},
				{6707.776,782.278,10.000,8.560},
				{6786.004,782.278,10.000,8.600},
				{6864.232,782.278,10.000,8.650},
				{6942.460,782.278,10.000,8.690},
				{7020.688,782.278,10.000,8.730},
				{7098.916,782.278,10.000,8.770},
				{7177.143,782.278,10.000,8.800},
				{7255.371,782.278,10.000,8.830},
				{7333.599,782.278,10.000,8.850},
				{7411.827,782.278,10.000,8.880},
				{7490.055,782.278,10.000,8.890},
				{7568.283,782.278,10.000,8.910},
				{7646.510,782.278,10.000,8.920},
				{7724.738,782.278,10.000,8.930},
				{7802.966,782.278,10.000,8.930},
				{7881.194,782.278,10.000,8.930},
				{7959.422,782.278,10.000,8.930},
				{8037.650,782.278,10.000,8.930},
				{8115.877,782.278,10.000,8.920},
				{8194.105,782.278,10.000,8.900},
				{8272.333,782.278,10.000,8.890},
				{8350.561,782.278,10.000,8.870},
				{8428.789,782.278,10.000,8.840},
				{8507.017,782.278,10.000,8.810},
				{8585.244,782.278,10.000,8.780},
				{8663.472,782.278,10.000,8.750},
				{8741.700,782.278,10.000,8.710},
				{8819.928,782.278,10.000,8.670},
				{8898.156,782.278,10.000,8.630},
				{8976.384,782.278,10.000,8.580},
				{9054.611,782.278,10.000,8.530},
				{9132.839,782.278,10.000,8.480},
				{9211.067,782.278,10.000,8.420},
				{9289.295,782.278,10.000,8.360},
				{9367.523,782.278,10.000,8.290},
				{9445.751,782.278,10.000,8.230},
				{9523.978,782.278,10.000,8.160},
				{9602.206,782.278,10.000,8.080},
				{9680.434,782.278,10.000,8.010},
				{9758.662,782.278,10.000,7.930},
				{9836.890,782.278,10.000,7.850},
				{9915.118,782.278,10.000,7.760},
				{9993.345,782.278,10.000,7.670},
				{10071.573,782.278,10.000,7.580},
				{10149.801,782.278,10.000,7.490},
				{10228.029,782.278,10.000,7.390},
				{10306.257,782.278,10.000,7.290},
				{10384.485,782.278,10.000,7.190},
				{10462.713,782.278,10.000,7.090},
				{10540.940,782.278,10.000,6.980},
				{10619.168,782.278,10.000,6.870},
				{10697.396,782.278,10.000,6.760},
				{10775.624,782.278,10.000,6.650},
				{10853.852,782.278,10.000,6.540},
				{10932.080,782.278,10.000,6.420},
				{11010.307,782.278,10.000,6.300},
				{11088.535,782.278,10.000,6.180},
				{11166.763,782.278,10.000,6.060},
				{11244.991,782.278,10.000,5.930},
				{11323.219,782.278,10.000,5.810},
				{11401.447,782.278,10.000,5.680},
				{11479.674,782.278,10.000,5.550},
				{11557.902,782.278,10.000,5.420},
				{11636.130,782.278,10.000,5.290},
				{11714.358,782.278,10.000,5.160},
				{11792.586,782.278,10.000,5.020},
				{11870.814,782.278,10.000,4.890},
				{11949.041,782.278,10.000,4.750},
				{12027.269,782.278,10.000,4.620},
				{12105.497,782.278,10.000,4.480},
				{12183.725,782.278,10.000,4.350},
				{12261.953,782.278,10.000,4.210},
				{12340.181,782.278,10.000,4.070},
				{12418.408,782.278,10.000,3.930},
				{12496.636,782.278,10.000,3.800},
				{12574.864,782.278,10.000,3.660},
				{12653.092,782.278,10.000,3.520},
				{12731.320,782.278,10.000,3.390},
				{12809.548,782.278,10.000,3.250},
				{12887.775,782.278,10.000,3.120},
				{12966.003,782.278,10.000,2.980},
				{13044.231,782.278,10.000,2.850},
				{13122.459,782.278,10.000,2.720},
				{13200.687,782.278,10.000,2.590},
				{13278.915,782.278,10.000,2.460},
				{13357.143,782.278,10.000,2.330},
				{13435.370,782.278,10.000,2.200},
				{13513.598,782.278,10.000,2.080},
				{13591.826,782.278,10.000,1.950},
				{13670.054,782.278,10.000,1.830},
				{13748.282,782.278,10.000,1.720},
				{13826.510,782.278,10.000,1.600},
				{13904.737,782.278,10.000,1.490},
				{13982.965,782.278,10.000,1.380},
				{14061.193,782.278,10.000,1.270},
				{14139.421,782.278,10.000,1.170},
				{14217.649,782.278,10.000,1.070},
				{14295.877,782.278,10.000,0.970},
				{14374.104,782.278,10.000,0.870},
				{14452.332,782.278,10.000,0.780},
				{14530.560,782.278,10.000,0.700},
				{14608.788,782.278,10.000,0.620},
				{14687.016,782.278,10.000,0.540},
				{14765.244,782.278,10.000,0.460},
				{14843.471,782.278,10.000,0.400},
				{14921.699,782.278,10.000,0.330},
				{14999.927,782.278,10.000,0.270},
				{15078.155,782.278,10.000,0.220},
				{15156.383,782.278,10.000,0.170},
				{15234.611,782.278,10.000,0.130},
				{15312.838,782.278,10.000,0.090},
				{15391.066,782.278,10.000,0.060},
				{15469.294,782.278,10.000,0.040},
				{15547.522,782.278,10.000,0.020},
				{15625.750,782.278,10.000,0.010},
				{15625.750,782.278,10.000,0.010},
				{15706.064,803.139,10.000,0.000},
				{15788.464,824.000,10.000,0.010},
				{15872.950,844.861,10.000,0.040},
				{15959.522,865.721,10.000,0.100},
				{16048.180,886.582,10.000,0.190},
				{16138.924,907.443,10.000,0.300},
				{16231.755,928.304,10.000,0.440},
				{16326.671,949.164,10.000,0.610},
				{16423.674,970.025,10.000,0.810},
				{16522.762,990.886,10.000,1.030},
				{16623.937,1011.747,10.000,1.290},
				{16727.198,1032.607,10.000,1.570},
				{16832.545,1053.468,10.000,1.870},
				{16939.977,1074.329,10.000,2.200},
				{17049.496,1095.190,10.000,2.560},
				{17161.102,1116.050,10.000,2.940},
				{17274.793,1136.911,10.000,3.340},
				{17390.570,1157.772,10.000,3.760},
				{17508.433,1178.633,10.000,4.200},
				{17628.382,1199.494,10.000,4.660},
				{17750.418,1220.354,10.000,5.130},
				{17874.539,1241.215,10.000,5.620},
				{18000.747,1262.076,10.000,6.120},
				{18129.041,1282.937,10.000,6.620},
				{18259.420,1303.797,10.000,7.130},
				{18389.800,1303.797,10.000,7.630},
				{18520.180,1303.797,10.000,8.120},
				{18650.560,1303.797,10.000,8.600},
				{18780.939,1303.797,10.000,9.070},
				{18911.319,1303.797,10.000,9.520},
				{19041.699,1303.797,10.000,9.960},
				{19172.078,1303.797,10.000,10.370},
				{19302.458,1303.797,10.000,10.760},
				{19432.838,1303.797,10.000,11.130},
				{19563.218,1303.797,10.000,11.480},
				{19693.597,1303.797,10.000,11.800},
				{19823.977,1303.797,10.000,12.090},
				{19954.357,1303.797,10.000,12.350},
				{20084.737,1303.797,10.000,12.590},
				{20215.116,1303.797,10.000,12.790},
				{20345.496,1303.797,10.000,12.970},
				{20475.876,1303.797,10.000,13.110},
				{20606.255,1303.797,10.000,13.220},
				{20736.635,1303.797,10.000,13.300},
				{20867.015,1303.797,10.000,13.350},
				{20997.395,1303.797,10.000,13.370},
				{21127.774,1303.797,10.000,13.350},
				{21258.154,1303.797,10.000,13.300},
				{21388.534,1303.797,10.000,13.220},
				{21518.914,1303.797,10.000,13.110},
				{21649.293,1303.797,10.000,12.960},
				{21779.673,1303.797,10.000,12.790},
				{21910.053,1303.797,10.000,12.580},
				{22040.432,1303.797,10.000,12.350},
				{22170.812,1303.797,10.000,12.090},
				{22301.192,1303.797,10.000,11.790},
				{22429.486,1282.937,10.000,11.480},
				{22555.693,1262.076,10.000,11.150},
				{22679.815,1241.215,10.000,10.800},
				{22801.850,1220.354,10.000,10.430},
				{22921.799,1199.494,10.000,10.050},
				{23039.663,1178.633,10.000,9.670},
				{23155.440,1157.772,10.000,9.270},
				{23269.131,1136.911,10.000,8.870},
				{23380.736,1116.050,10.000,8.460},
				{23490.255,1095.190,10.000,8.060},
				{23597.688,1074.329,10.000,7.650},
				{23703.035,1053.468,10.000,7.250},
				{23806.296,1032.607,10.000,6.840},
				{23907.470,1011.747,10.000,6.450},
				{24006.559,990.886,10.000,6.060},
				{24103.561,970.025,10.000,5.680},
				{24198.478,949.164,10.000,5.310},
				{24291.308,928.304,10.000,4.940},
				{24382.052,907.443,10.000,4.590},
				{24470.711,886.582,10.000,4.260},
				{24557.283,865.721,10.000,3.930},
				{24641.769,844.861,10.000,3.620},
				{24724.169,824.000,10.000,3.320},
				{24804.483,803.139,10.000,3.030},
				{24882.711,782.278,10.000,2.760},
				{24958.852,761.418,10.000,2.510},
				{25032.908,740.557,10.000,2.270},
				{25104.878,719.696,10.000,2.040},
				{25174.761,698.835,10.000,1.830},
				{25242.559,677.975,10.000,1.630},
				{25308.270,657.114,10.000,1.450},
				{25371.895,636.253,10.000,1.280},
				{25433.435,615.392,10.000,1.120},
				{25492.888,594.532,10.000,0.980},
				{25550.255,573.671,10.000,0.850},
				{25605.536,552.810,10.000,0.730},
				{25658.731,531.949,10.000,0.630},
				{25709.840,511.089,10.000,0.530},
				{25758.862,490.228,10.000,0.450},
				{25805.799,469.367,10.000,0.370},
				{25850.650,448.506,10.000,0.310},
				{25893.414,427.646,10.000,0.250},
				{25934.093,406.785,10.000,0.200},
				{25972.685,385.924,10.000,0.160},
				{26009.191,365.063,10.000,0.120},
				{26043.612,344.202,10.000,0.090},
				{26075.946,323.342,10.000,0.070},
				{26106.194,302.481,10.000,0.050},
				{26134.356,281.620,10.000,0.030},
				{26160.432,260.759,10.000,0.020},
				{26184.422,239.899,10.000,0.010},
				{26206.326,219.038,10.000,0.010},
				{26226.143,198.177,10.000,0.000},
				{26243.875,177.316,10.000,0.000},
				{26259.521,156.456,10.000,0.000},
				{26273.080,135.595,10.000,0.000},
				{26284.553,114.734,10.000,0.000},
				{26293.941,93.873,10.000,0.000},
				{26301.242,73.013,10.000,0.000},
				{26306.457,52.152,10.000,0.000}		};

}