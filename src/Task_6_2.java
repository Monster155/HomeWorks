public class Task_6_2 {
    public static void main(String[] args) {
        long time = System.currentTimeMillis();
//        int[] arr = sort(new int[]{1, 6, 2, 6, 8, 4, 2, 7, 9});
        int[] arr = sort(new int[]{
                548, 324, 943, 993, 311, 638, 876, 121, 460, 984, 840, 561, 487, 91, 375, 360, 84, 642, 165, 651, 613, 460, 273, 263, 348, 586, 588, 548, 795, 685, 454, 116, 427, 714, 28, 829, 530, 876, 262, 92, 452, 422, 514, 204, 426, 31, 719, 315, 332, 121, 725, 288, 210, 616, 878, 625, 66, 441, 183, 432, 532, 216, 412, 313, 244, 435, 321, 983, 373, 691, 776, 322, 615, 360, 893, 614, 73, 530, 549, 668, 903, 840, 457, 597, 283, 345, 804, 94, 270, 485, 900, 137, 356, 695, 588, 196, 90, 282, 225, 176, 977, 678, 888, 539, 942, 320, 83, 256, 69, 997, 653, 508, 991, 667, 752, 357, 241, 419, 734, 901, 148, 469, 560, 813, 333, 835, 840, 517, 696, 582, 962, 696, 841, 364, 847, 247, 264, 310, 735, 301, 242, 172, 76, 414, 329, 56, 40, 594, 518, 977, 366, 374, 652, 964, 290, 776, 417, 403, 55, 623, 300, 857, 80, 319, 220, 644, 215, 930, 171, 45, 621, 116, 65, 126, 730, 223, 189, 822, 428, 626, 103, 94, 74, 265, 559, 699, 213, 128, 32, 336, 882, 345, 764, 725, 216, 479, 777, 474, 660, 504, 201, 420, 454, 0, 372, 511, 244, 44, 619, 177, 585, 361, 310, 589, 829, 333, 772, 162, 396, 608, 911, 126, 703, 140, 946, 62, 102, 694, 483, 803, 995, 24, 264, 225, 955, 163, 319, 63, 63, 529, 938, 12, 870, 845, 804, 92, 360, 169, 881, 438, 49, 709, 184, 441, 869, 480, 315, 409, 823, 239, 766, 767, 468, 639, 326, 117, 182, 970, 593, 351, 808, 386, 483, 430, 720, 61, 874, 354, 569, 275, 961, 312, 968, 37, 712, 2, 169, 500, 820, 624, 327, 66, 909, 128, 303, 790, 341, 841, 95, 419, 877, 779, 873, 145, 595, 525, 286, 976, 960, 816, 198, 399, 637, 607, 233, 919, 679, 708, 564, 884, 8, 797, 185, 980, 701, 956, 488, 672, 429, 698, 380, 880, 562, 836, 277, 178, 868, 419, 310, 836, 426, 416, 743, 107, 382, 779, 153, 264, 422, 15, 161, 7, 392, 401, 597, 60, 337, 573, 819, 931, 305, 263, 520, 82, 706, 600, 772, 965, 640, 539, 265, 720, 584, 656, 621, 616, 77, 768, 466, 676, 523, 558, 440, 330, 71, 701, 653, 331, 564, 742, 186, 624, 965, 360, 115, 343, 250, 485, 189, 606, 736, 152, 735, 334, 969, 918, 580, 871, 813, 85, 778, 811, 147, 31, 736, 37, 595, 413, 841, 690, 86, 101, 113, 418, 613, 277, 455, 60, 476, 243, 45, 594, 463, 150, 52, 57, 862, 20, 368, 878, 952, 161, 268, 990, 622, 309, 961, 933, 87, 609, 806, 76, 209, 855, 552, 50, 842, 236, 342, 442, 721, 218, 394, 828, 850, 76, 177, 244, 69, 38, 651, 277, 427, 943, 627, 58, 284, 828, 586, 578, 606, 877, 359, 895, 739, 715, 919, 23, 66, 117, 157, 497, 338, 843, 930, 879, 142, 411, 834, 770, 939, 364, 169, 176, 302, 733, 258, 494, 558, 206, 866, 683, 771, 724, 734, 690, 138, 81, 387, 569, 200, 423, 188, 266, 910, 393, 337, 510, 548, 105, 895, 827, 641, 19, 160, 230, 575, 289, 724, 772, 298, 125, 317, 752, 624, 236, 100, 67, 917, 488, 423, 848, 589, 500, 193, 309, 710, 986, 898, 438, 225, 358, 15, 976, 692, 221, 20, 966, 234, 167, 438, 971, 373, 453, 448, 973, 754, 986, 317, 865, 289, 291, 581, 400, 190, 11, 229, 441, 412, 833, 338, 355, 530, 652, 513, 443, 726, 196, 219, 367, 564, 313, 615, 638, 505, 619, 731, 358, 657, 189, 946, 581, 67, 600, 540, 855, 5, 651, 719, 714, 55, 740, 937, 192, 510, 39, 505, 664, 522, 239, 469, 697, 702, 915, 469, 892, 353, 242, 837, 134, 363, 111, 508, 44, 812, 476, 396, 884, 758, 119, 775, 657, 254, 859, 873, 635, 641, 663, 293, 88, 276, 32, 134, 584, 442, 490, 651, 792, 853, 7, 105, 391, 297, 725, 991, 332, 238, 363, 198, 402, 826, 339, 768, 760, 663, 687, 832, 895, 827, 552, 994, 220, 128, 205, 898, 345, 292, 232, 957, 940, 804, 789, 278, 963, 403, 618, 613, 952, 854, 779, 745, 24, 424, 926, 150, 205, 685, 320, 855, 722, 643, 644, 426, 923, 932, 150, 681, 569, 778, 608, 264, 349, 703, 29, 475, 581, 507, 152, 824, 259, 868, 254, 618, 770, 29, 908, 525, 860, 434, 951, 445, 671, 822, 71, 239, 961, 288, 82, 800, 942, 1, 201, 733, 546, 836, 360, 419, 256, 938, 864, 572, 129, 335, 520, 476, 14, 67, 696, 971, 505, 949, 625, 917, 621, 6, 694, 304, 801, 808, 358, 391, 332, 441, 805, 252, 938, 610, 487, 915, 925, 397, 130, 807, 881, 558, 948, 594, 695, 838, 304, 611, 323, 655, 235, 999, 538, 734, 880, 341, 662, 645, 35, 65, 110, 16, 771, 134, 419, 144, 306, 581, 339, 71, 69, 243, 455, 736, 236, 652, 767, 701, 817, 433, 635, 74, 777, 690, 496, 686, 539, 808, 808, 269, 687, 830, 738, 384, 598, 61, 232, 105, 285, 821, 211, 8, 701, 363, 827, 863, 348, 776, 902, 503, 112, 364, 883, 787, 847, 357, 942, 178, 403, 29, 97, 486, 467, 255, 590, 501, 783, 283, 77, 792, 91, 53, 599, 728, 353, 680, 689, 876, 704, 830, 449, 261, 828, 588, 868, 647, 398, 90, 209, 903, 560, 585, 782, 716, 419, 882, 36, 425, 912, 63, 476, 476, 459, 189, 556, 96, 320, 248, 367, 61, 616, 951, 632, 88, 584, 121, 233, 241, 734, 303, 289, 926, 234, 941, 558, 520, 46, 893, 772, 373, 5, 372, 378, 987, 326, 362, 15, 436, 766, 417, 997, 694, 978, 346, 10, 381, 452, 627, 200, 599, 766, 591, 845, 926, 823, 332, 856, 366, 119, 26, 395, 26, 113, 840, 24, 549, 203, 900, 934, 906, 887, 842, 944, 946, 205, 325, 176, 245, 671, 497, 553, 161, 512, 826, 478, 689, 172, 901, 396, 664, 742, 738, 232, 86, 160, 944, 53, 869, 801, 559, 689, 107, 316, 746, 479, 30, 418, 596, 715, 178, 623, 161, 879, 985, 844, 515, 246, 854, 114, 76, 981, 32, 665, 622, 426, 78, 40, 464, 865, 470, 908, 996, 711, 960, 780, 423, 702, 601, 888, 802, 406, 998, 51, 667, 45, 209, 497, 399, 427, 899, 248, 208, 547, 823, 850, 70, 257, 410, 960, 171, 233, 285, 512, 500, 380, 818, 6, 0, 710, 407, 721, 314, 677, 29, 526, 501, 942, 765, 311, 306, 540, 395, 970, 455, 461, 903, 282, 190, 725, 677, 36, 780, 159, 485, 185, 967, 169, 836, 882, 449, 24, 184, 795, 267, 306, 526, 168, 652, 462, 339, 740, 258, 609, 488, 758, 911, 65, 670, 30, 970, 379, 216, 136, 139, 986, 574, 697, 128, 32, 590, 860, 837, 262, 811, 953, 854, 382, 359, 618, 941, 740, 586, 594, 816, 677, 650, 705, 999, 482, 330, 569, 691, 394, 912, 977, 682, 762, 721, 903, 29, 46, 947, 616, 844, 57, 707, 436, 866, 503, 941, 256, 590, 637, 586, 51, 690, 580, 669, 297, 93, 653, 426, 332, 598, 905, 254, 468, 124, 845, 349, 862, 753, 305, 176, 956, 516, 238, 477, 579, 476, 230, 414, 668, 41, 474, 562, 898, 584, 955, 892, 449, 413, 646, 604, 535, 809, 580, 639, 306, 403, 766, 971, 217, 405, 60, 325, 973, 276, 245, 817, 740, 289, 796, 73, 372, 28, 20, 839, 38, 307, 514, 720, 785, 150, 195, 646, 230, 482, 452, 933, 820, 881, 339, 275, 819, 332, 110, 834, 458, 182, 807, 661, 497, 622, 57, 50, 782, 902, 724, 57, 239, 118, 554, 349, 173, 857, 502, 737, 627, 231, 999, 269, 64, 787, 21, 468, 601, 608, 445, 403, 549, 436, 862, 579, 81, 50, 694, 246, 430, 198, 205, 632, 134, 333, 730, 764, 503, 76, 284, 995, 651, 790, 472, 108, 166, 918, 523, 854, 710, 754, 136, 114, 647, 145, 730, 430, 67, 196, 673, 508, 436, 455, 981, 466, 474, 175, 66, 983, 723, 227, 73, 244, 762, 930, 474, 544, 919, 578, 672, 675, 877, 721, 478, 794, 569, 324, 540, 257, 311, 769, 941, 64, 229, 296, 462, 915, 627, 880, 226, 549, 120, 740, 759, 35, 12, 620, 790, 856, 627, 781, 516, 201, 45, 116, 383, 637, 953, 163, 896, 439, 141, 853, 388, 201, 512, 737, 177, 994, 332, 46, 28, 274, 852, 437, 392, 924, 361, 446, 463, 320, 199, 695, 689, 60, 247, 679, 17, 71, 922, 527, 804, 92, 792, 452, 47, 193, 486, 768, 268, 843, 696, 235, 211, 231, 729, 170, 230, 998, 242, 275, 129, 258, 497, 336, 22, 832, 729, 11, 695, 876, 983, 723, 847, 714, 97, 273, 548, 489, 320, 172, 219, 439, 447, 831, 452, 0, 248, 700, 34, 644, 374, 167, 590, 350, 925, 517, 399, 879, 326, 550, 23, 553, 192, 501, 602, 89, 426, 772, 824, 136, 867, 592, 842, 554, 437, 135, 633, 155, 873, 834, 616, 576, 822, 545, 647, 184, 278, 45, 871, 439, 92, 802, 288, 939, 556, 321, 316, 432, 871, 443, 63, 465, 638, 856, 515, 973, 388, 726, 355, 17, 569, 808, 640, 113, 317, 608, 176, 64, 837, 165, 14, 957, 171, 815, 101, 81, 692, 854, 832, 793, 689, 355, 913, 20, 18, 551, 668, 951, 899, 55, 711, 635, 581, 920, 667, 697, 812, 993, 462, 67, 710, 255, 542, 676, 926, 909, 285, 348, 733, 745, 756, 702, 984, 944, 939, 737, 739, 837, 514, 926, 690, 302, 294, 42, 472, 415, 456, 673, 302, 695, 773, 348, 430, 778, 166, 471, 314, 652, 22, 804, 488, 623, 882, 72, 656, 54, 320, 376, 596, 525, 36, 482, 111, 481, 470, 736, 397, 619, 507, 308, 882, 229, 190, 694, 801, 472, 703, 938, 511, 88, 241, 822, 846, 355, 867, 347, 577, 225, 810, 202, 421, 393, 226, 560, 885, 786, 893, 433, 644, 320, 862, 71, 66, 47, 691, 330, 986, 801, 437, 730, 791, 214, 262, 957, 437, 560, 152, 900, 40, 234, 939, 917, 300, 763, 566, 922, 117, 200, 268, 55, 410, 404, 154, 155, 345, 199, 472, 977, 859, 648, 731, 142, 648, 709, 684, 58, 534, 364, 134, 686, 440, 887, 468, 837, 43, 318, 764, 859, 536, 343, 376, 974, 836, 741, 901, 248, 5, 254, 533, 156, 598, 262, 888, 953, 176, 912, 529, 642, 216, 411, 591, 136, 218, 56, 93, 326, 904, 173, 742, 157, 3, 576, 330, 504, 288, 314, 58, 565, 187, 459, 505, 743, 526, 457, 256, 508, 691, 46, 635, 510, 770, 121, 354, 314, 45, 968, 397, 473, 551, 199, 869, 304, 262, 355, 100, 648, 891, 605, 812, 115, 203, 160, 726, 776, 210, 54, 595, 57, 611, 698, 294, 613, 352, 197, 228, 307, 264, 751, 58, 29, 286, 593, 445, 959, 935, 832, 276, 88, 308, 232, 632, 230, 98, 462, 575, 510, 805, 581, 682, 343, 577, 548, 148, 173, 893, 389, 168, 883, 576, 218, 300, 579, 513, 701, 440, 657, 778, 707, 84, 428, 776, 825, 563, 336, 465, 146, 48, 722, 644, 217, 176, 434, 836, 343, 326, 52, 256, 496, 699, 386, 980, 909, 598, 982, 461, 83, 479, 774, 182, 332, 655, 690, 387, 169, 779, 981, 505, 835, 588, 269, 92, 989, 724, 818, 859, 127, 838, 366, 642, 630, 592, 886, 962, 383, 633, 44, 150, 845, 73, 740, 919, 62, 540, 52, 616, 580, 377, 109, 347, 408, 164, 890, 632, 218, 324, 732, 223, 719, 218, 356, 251, 723, 784, 579, 929, 755, 494, 453, 612, 198, 109, 498, 152, 861, 477, 847, 111, 545, 428, 579, 602, 664, 601, 266, 212, 216, 935, 753, 734, 438, 412, 506, 185, 285, 551, 434, 904, 489, 136, 957, 362, 292, 583, 220, 675, 149, 407, 804, 721, 600, 270, 948, 188, 239, 157, 322, 844, 233, 338, 636, 804, 82, 922, 912, 606, 414, 933, 99, 461, 433, 79, 797, 119, 274, 586, 263, 424, 909, 742, 539, 774, 468, 63, 488, 382, 771, 353, 785, 443, 651, 243, 398, 77, 157, 199, 898, 147, 53, 406, 41, 913, 117, 365, 386, 769, 622, 541, 388, 220, 38, 879, 300, 619, 442, 578, 464, 141, 312, 55, 988, 926, 430, 654, 654, 305, 352, 281, 884, 566, 503, 802, 953, 751, 286, 763, 243, 593, 706, 683, 214, 777, 949, 970, 962, 399, 18, 253, 659, 664, 999, 797, 926, 553, 809, 476, 209, 473, 267, 686, 508, 651, 177, 488, 402, 334, 693, 221, 166, 732, 617, 803, 938, 945, 425, 937, 266, 90, 778, 486, 145, 205, 961, 366, 563, 525, 247, 377, 891, 177, 393, 556, 990, 382, 609, 781, 723, 826, 137, 570, 673, 908, 232, 225, 291, 221, 721, 737, 316, 777, 526, 186, 313, 134, 492, 629, 387, 828, 622, 898, 637, 246, 337, 44, 753, 336, 718, 628, 176, 384, 758, 482, 674, 392, 541, 44, 753, 489, 914, 883, 318, 192, 670, 567, 140, 254, 460, 611, 214, 325, 676, 812, 835, 623, 298, 960, 287, 345, 311, 524, 342, 598, 571, 668, 405, 227, 213, 616, 13, 31, 510, 204, 580, 494, 856, 199, 721, 364, 976, 824, 247, 105, 712, 738, 905, 490, 801, 661, 273, 402, 844, 690, 770, 177, 260, 337, 610, 696, 422, 286, 683, 770, 293, 867, 746, 298, 855, 306, 37, 72, 307, 848, 378, 73, 541, 995, 139, 638, 667, 190, 948, 817, 433, 487, 881, 892, 217, 897, 970, 40, 914, 377, 257, 775, 430, 644, 299, 964, 690, 310, 984, 855, 40, 160, 746, 801, 676, 720, 788, 102, 244, 674, 721, 629, 107, 99, 115, 760, 829, 912, 785, 431, 332, 428, 327, 14, 822, 423, 295, 123, 25, 634, 646, 379, 502, 211, 543, 616, 782, 222, 398, 30, 887, 958, 46, 258, 325, 450, 329, 484, 26, 304, 900, 190, 786, 674, 40, 348, 706, 980, 363, 461, 800, 746, 817, 57, 418, 758, 68, 949, 369, 598, 397, 813, 680, 501, 537, 417, 726, 378, 449, 142, 61, 808, 894, 257, 672, 784, 814, 790, 509, 994, 943, 754, 110, 460, 780, 868, 832, 438, 32, 928, 738, 586, 933, 458, 418, 519, 336, 264, 143, 57, 369, 125, 557, 674, 502, 908, 746, 848, 298, 1, 951, 314, 786, 148, 340, 479, 326, 412, 269, 604, 117, 224, 181, 684, 960, 218, 833, 370, 734, 813, 864, 671, 101, 326, 795, 624, 302, 732, 447, 608, 585, 42, 396, 472, 688, 689, 553, 200, 36, 232, 151, 400, 780, 143, 423, 503, 573, 463, 71, 206, 35, 591, 133, 339, 170, 576, 255, 57, 644, 841, 461, 948, 672, 374, 453, 454, 491, 109, 119, 754, 795, 373, 460, 90, 306, 976, 322, 382, 601, 810, 420, 852, 677, 543, 916, 283, 269, 338, 402, 497, 826, 350, 552, 626, 175, 112, 833, 718, 322, 858, 602, 311, 577, 197, 658, 637, 118, 586, 811, 245, 435, 496, 289, 960, 600, 192, 907, 253, 155, 640, 732, 305, 534, 86, 626, 261, 286, 525, 450, 453, 89, 383, 888, 622, 462, 446, 846, 535, 331, 262, 100, 715, 124, 6, 433, 391, 864, 44, 786, 203, 802, 264, 57, 626, 513, 568, 54, 570, 990, 784, 769, 104, 220, 663, 579, 821, 913, 554, 183, 885, 555, 805, 116, 471, 705, 950, 431, 862, 516, 247, 730, 208, 795, 189, 50, 599, 504, 219, 246, 847, 526, 965, 417, 134, 660, 991, 618, 469, 302, 214, 551, 726, 957, 878, 205, 861, 794, 185, 415, 835, 710, 495, 169, 642, 983, 274, 29, 808, 422, 839, 468, 707, 95, 302, 25, 39, 114, 4, 173, 858, 681, 189, 467, 611, 558, 599, 74, 760, 419, 195, 48, 662, 73, 191, 797, 598, 380, 200, 3, 985, 788, 327, 918, 64, 826, 686, 342, 621, 537, 969, 779, 551, 810, 373, 252, 441, 797, 387, 989, 681, 113, 713, 749, 970, 326, 847, 830, 561, 309, 658, 956, 966, 408, 645, 44, 372, 988, 413, 579, 499, 881, 312, 713, 185, 429, 112, 441, 541, 332, 55, 223, 138, 246, 603, 171, 312, 148, 749, 517, 333, 807, 785, 394, 897, 305, 42, 114, 105, 449, 191, 14, 877, 84, 401, 630, 520, 782, 760, 454, 988, 96, 155, 748, 252, 611, 980, 932, 49, 298, 856, 892, 203, 270, 856, 128, 684, 899, 522, 43, 497, 389, 388, 846, 562, 318, 579, 450, 731, 393, 495, 508, 192, 604, 574, 186, 615, 267, 587, 588, 498, 984, 966, 792, 372, 357, 220, 320, 698, 440, 566, 459, 524, 263, 532, 296, 228, 478, 447, 489, 961, 91, 384, 780, 727, 507, 378, 2, 398, 619, 424, 863, 322, 475, 114, 110, 624, 135, 490, 770, 733, 682, 99, 25, 143, 12, 63, 960, 936, 928, 392, 843, 117, 283, 696, 827, 406, 401, 905, 952, 713, 759, 623, 125, 170, 976, 238, 302, 251, 480, 980, 455, 204, 824, 710, 13, 774, 527, 334, 412, 898, 492, 377, 23, 919, 477, 462, 245, 611, 878, 113, 777, 220, 52, 571, 116, 571, 743, 79, 154, 223, 729, 393, 321, 608, 680, 124, 123, 35, 356, 861, 56, 493, 698, 963, 837, 195, 60, 294, 591, 876, 835, 174, 154, 994, 973, 290, 929, 73, 450, 343, 782, 615, 574, 764, 324, 220, 117, 919, 554, 730, 672, 827, 228, 538, 273, 601, 526, 432, 320, 444, 540, 711, 29, 316, 886, 629, 193, 60, 232, 637, 810, 106, 895, 276, 216, 643, 717, 55, 735, 497, 328, 85, 479, 830, 550, 799, 884, 158, 145, 573, 721, 120, 309, 683, 881, 919, 354, 600, 918, 296, 749, 277, 442, 472, 303, 754, 764, 535, 592, 66, 791, 305, 857, 229, 80, 885, 531, 760, 129, 701, 198, 63, 427, 48, 314, 748, 536, 863, 210, 875, 472, 675, 988, 954, 987, 481, 678, 466, 882, 591, 670, 604, 389, 302, 770, 932, 783, 673, 420, 643, 786, 530, 526, 150, 78, 287, 89, 824, 161, 118, 325, 774, 140, 510, 217, 714, 482, 264, 559, 126, 689, 544, 340, 115, 905, 680, 978, 592, 867, 45, 310, 667, 303, 460, 431, 429, 811, 291, 452, 626, 510, 591, 982, 81, 249, 378, 690, 82, 970, 451, 613, 413, 912, 897, 952, 100, 668, 836, 0, 468, 793, 774, 488, 572, 538, 352, 72, 644, 539, 224, 918, 743, 723, 220, 327, 400, 506, 995, 128, 702, 375, 829, 142, 895, 279, 363, 351, 318, 893, 587, 532, 165, 664, 550, 40, 382, 759, 897, 87, 733, 471, 520, 363, 964, 382, 322, 62, 772, 591, 342, 444, 232, 617, 252, 846, 206, 174, 556, 674, 236, 859, 644, 269, 371, 940, 237, 701, 421, 881, 646, 485, 127, 890, 701, 941, 863, 821, 180, 393, 529, 983, 39, 723, 480, 981, 790, 827, 461, 536, 921, 386, 738, 341, 328, 977, 842, 397, 371, 960, 583, 962, 295, 778, 298, 176, 440, 252, 623, 679, 898, 226, 408, 58, 975, 446, 803, 735, 145, 849, 936, 3, 933, 570, 78, 291, 545, 811, 637, 341, 913, 412, 844, 948, 214, 362, 554, 78, 870, 748, 118, 703, 485, 611, 911, 419, 183, 970, 740, 998, 304, 850, 987, 318, 527, 469, 83, 769, 999, 893, 601, 70, 246, 359, 32, 661, 233, 153, 93, 244, 152, 409, 241, 809, 211, 441, 915, 485, 961, 256, 912, 858, 446, 696, 225, 975, 792, 273, 606, 122, 668, 124, 107, 583, 430, 663, 843, 46, 671, 470, 294, 988, 286, 648, 483, 383, 191, 399, 529, 327, 256, 845, 156, 741, 101, 194, 936, 119, 908, 165, 234, 415, 519, 264, 33, 545, 704, 851, 107, 665, 619, 172, 270, 324, 178, 486, 764, 841, 236, 150, 213, 756, 283, 86, 923, 28, 555, 346, 758, 695, 331, 604, 237, 114, 481, 249, 4, 498, 230, 463, 305, 436, 475, 35, 662, 230, 947, 957, 507, 429, 947, 793, 127, 661, 405, 613, 916, 925, 510, 864, 599, 849, 237, 867, 777, 13, 663, 763, 874, 324, 101, 660, 334, 630, 720, 393, 691, 179, 495, 781, 975, 286, 59, 551, 752, 594, 258, 74, 981, 578, 989, 924, 814, 575, 207, 844, 360, 417, 823, 57, 463, 953, 591, 72, 526, 113, 958, 16, 450, 912, 318, 275, 842, 743, 35, 724, 742, 605, 127, 107, 254, 446, 494, 176, 627, 617, 165, 71, 537, 574, 91, 25, 538, 329, 652, 903, 914, 839, 192, 250, 460, 463, 567, 517, 28, 881, 912, 880, 41, 335, 570, 571, 543, 913, 413, 3, 799, 616, 571, 24, 865, 352, 935, 522, 57, 623, 668, 282, 748, 591, 359, 393, 460, 431, 367, 767, 776, 338, 394, 303, 237, 347, 297, 16, 980, 162, 678, 30, 561, 511, 854, 659, 105, 172, 382, 937, 645, 687, 457, 867, 262, 980, 112, 335, 458, 508, 374, 125, 978, 364, 200, 690, 178, 716, 296, 420, 905, 289, 672, 883, 775, 188, 102, 201, 679, 187, 490, 11, 336, 777, 518, 696, 689, 680, 853, 441, 30, 248, 595, 449, 761, 126, 655, 98, 830, 864, 205, 159, 13, 674, 384, 198, 366, 380, 4, 183, 373, 718, 63, 913, 554, 505, 538, 291, 530, 930, 13, 682, 868, 99, 445, 521, 311, 264, 536, 136, 386, 650, 942, 238, 741, 596, 821, 876, 990, 815, 32, 740, 292, 925, 626, 558, 352, 59, 134, 11, 70, 270, 584, 19, 573, 670, 66, 462, 951, 695, 170, 418, 627, 702, 580, 769, 911, 106, 659, 600, 960, 616, 888, 145, 62, 748, 641, 179, 894, 657, 865, 652, 144, 538, 907, 42, 710, 260, 888, 395, 476, 672, 772, 252, 536, 11, 473, 696, 625, 141, 156, 584, 415, 952, 183, 599, 289, 79, 978, 150, 193, 267, 475, 301, 153, 112, 696, 846, 102, 632, 442, 361, 727, 89, 47, 593, 153, 759, 630, 775, 402, 891, 306, 589, 746, 933, 382, 274, 257, 200, 634, 53, 96, 562, 394, 439, 333, 402, 325, 170, 375, 34, 423, 486, 420, 33, 28, 234, 688, 414, 343, 801, 572, 424, 247, 180, 268, 767, 993, 602, 885, 458, 705, 4, 516, 137, 496, 294, 268, 596, 361, 781, 762, 479, 7, 391, 228, 594, 176, 257, 881, 63, 63, 84, 916, 547, 919, 232, 143, 150, 998, 813, 933, 197, 604, 223, 923, 967, 91, 441, 660, 652, 344, 105, 148, 263, 410, 864, 111, 918, 722, 723, 613, 998, 526, 178, 561, 926, 969, 693, 552, 925, 551, 729, 452, 943, 528, 854, 75, 121, 184, 656, 344, 539, 818, 112, 366, 746, 706, 768, 890, 515, 264, 627, 766, 556, 128, 858, 116, 459, 911, 589, 118, 972, 911, 800, 492, 829, 184, 37, 3, 725, 968, 22, 554, 733, 617, 449, 747, 370, 886, 213, 79, 812, 608, 84, 332, 204, 552, 349, 70, 886, 531, 285, 581, 366, 630, 394, 54, 277, 754, 228, 251, 172, 583, 274, 443, 958, 394, 827, 919, 940, 173, 965, 966, 959, 866, 785, 776, 875, 641, 801, 429, 664, 545, 995, 716, 771, 994, 343, 292, 930, 116, 773, 357, 583, 111, 408, 842, 183, 407, 650, 853, 142, 589, 114, 939, 889, 799, 687, 643, 558, 529, 18, 608, 81, 508, 536, 513, 90, 711, 724, 973, 835, 313, 728, 590, 522, 831, 532, 288, 859, 545, 904, 158, 321, 762, 988, 67, 617, 414, 961, 421, 131, 15, 435, 577, 628, 969, 342, 593, 367, 848, 908, 176, 866, 274, 929, 934, 955, 715, 965, 279, 418, 617, 285, 636, 506, 994, 319, 928, 801, 806, 190, 652, 453, 185, 348, 245, 612, 877, 720, 883, 933, 21, 843, 247, 414, 784, 315, 327, 464, 186, 597, 797, 12, 880, 587, 73, 683, 576, 660, 689, 543, 252, 813, 288, 694, 295, 386, 110, 30, 241, 360, 543, 809, 833, 598, 6, 311, 703, 500, 140, 709, 113, 481, 77, 510, 823, 335, 292, 318, 346, 43, 433, 451, 561, 820, 306, 930, 891, 244, 143, 681, 39, 94, 133, 353, 563, 152, 196, 12, 434, 591, 920, 137, 63, 698, 614, 737, 197, 669, 447, 136, 505, 902, 741, 938, 662, 705, 567, 971, 189, 660, 935, 541, 368, 900, 38, 159, 101, 434, 192, 29, 645, 262, 370, 946, 806, 447, 442, 970, 300, 476, 574, 138, 683, 233, 522, 781, 455, 653, 925, 457, 697, 638, 87, 375, 859, 170, 141, 209, 143, 612, 954, 606, 239, 75, 585, 300, 60, 408, 638, 681, 509, 774, 384, 885, 250, 14, 85, 928, 901, 994, 588, 189, 95, 930, 849, 608, 330, 211, 748, 269, 624, 635, 228, 657, 572, 49, 539, 783, 497, 338, 100, 528, 61, 350, 317, 14, 878, 862, 478, 549, 368, 895, 730, 715, 360, 762, 17, 444, 693, 6, 756, 542, 408, 22, 3, 938, 925, 487, 819, 120, 991, 925, 556, 603, 84, 637, 837, 16, 357, 955, 58, 348, 227, 308, 348, 173, 139, 812, 69, 233, 115, 224, 81, 565, 228, 901, 216, 486, 219, 39, 612, 131, 121, 895, 833, 917, 882, 853, 979, 262, 661, 198, 328, 113, 696, 166, 376, 373, 378, 437, 559, 88, 420, 479, 327, 358, 872, 303, 703, 293, 991, 31, 939, 950, 920, 355, 373, 153, 466, 384, 146, 272, 252, 629, 9, 524, 935, 828, 44, 134, 198, 150, 762, 754, 751, 835, 711, 827, 623, 695, 404, 241, 611, 32, 140, 480, 876, 406, 3, 650, 335, 416, 162, 247, 656, 95, 376, 209, 389, 778, 486, 874, 19, 350, 559, 730, 473, 570, 234, 408, 948, 778, 820, 281, 749, 675, 610, 110, 186, 988, 947, 654, 512, 818, 564, 837, 265, 158, 829, 49, 385, 568, 605, 444, 938, 296, 582, 630, 334, 181, 108, 972, 436, 522, 713, 863, 98, 732, 784, 676, 254, 987, 93, 806, 822, 281, 153, 169, 410, 268, 732, 735, 975, 18, 177, 216, 355, 338, 607, 806, 870, 645, 423, 969, 983, 456, 62, 619, 345, 432, 374, 670, 442, 586, 514, 885, 425, 695, 790, 117, 667, 172, 481, 571, 33, 659, 220, 420, 845, 391, 194, 215, 63, 927, 73, 833, 238, 211, 269, 290, 386, 31, 853, 707, 73, 865, 229, 805, 601, 788, 446, 835, 426, 580, 844, 533, 597, 430, 595, 730, 289, 666, 577, 539, 247, 738, 930, 626, 283, 308, 609, 911, 800, 638, 188, 231, 681, 659, 224, 856, 780, 7, 499, 521, 699, 82, 532, 570, 466, 626, 874, 102, 250, 645, 809, 549, 268, 544, 265, 941, 580, 197, 938, 239, 567, 284, 830, 482, 509, 655, 717, 197, 823, 653, 281, 450, 190, 315, 32, 166, 42, 94, 445, 863, 592, 310, 151, 726, 888, 827, 421, 51, 151, 551, 642, 432, 35, 242, 947, 704, 267, 749, 672, 598, 558, 265, 876, 242, 603, 371, 684, 140, 428, 675, 876, 42, 366, 621, 715, 130, 443, 590, 735, 308, 23, 802, 849, 985, 148, 598, 908, 610, 125, 646, 572, 437, 559, 252, 170, 391, 208, 468, 14, 704, 771, 908, 522, 962, 929, 240, 355, 515, 754, 121, 714, 791, 913, 932, 876, 905, 905, 76, 20, 93, 970, 712, 427, 938, 178, 779, 145, 37, 653, 864, 308, 770, 857, 969, 390, 75, 320, 515, 808, 700, 278, 995, 456, 206, 167, 515, 936, 145, 88, 107, 516, 187, 904, 79, 50, 670, 832, 898, 431, 993, 32, 20, 443, 502, 954, 871, 243, 51, 892, 699, 89, 187, 519, 338, 320, 39, 951, 5, 91, 285, 227, 147, 783, 278, 995, 995, 565, 283, 527, 937, 101, 13, 190, 19, 968, 127, 910, 910, 968, 110, 180, 436, 125, 27, 687, 335, 854, 949, 685, 276, 459, 459, 824, 255, 855, 569, 280, 430, 180, 509, 650, 127, 720, 327, 295, 224, 433, 984, 496, 362, 179, 614, 32, 483, 656, 941, 599, 988, 965, 423, 735, 414, 664, 540, 818, 910, 145, 791, 13, 923, 199, 399, 992, 491, 641, 404, 647, 202, 963, 836, 0, 426, 81, 902, 986, 690, 370, 684, 842, 122, 342, 674, 351, 755, 542, 569, 306, 81, 428, 163, 168, 691, 293, 819, 36, 976, 558, 984, 742, 881, 94, 421, 73, 423, 582, 377, 891, 225, 297, 669, 180, 651, 129, 787, 855, 174, 98, 433, 517, 553, 82, 604, 190, 975, 12, 194, 489, 835, 296, 350, 586, 972, 848, 260, 824, 242, 650, 841, 788, 57, 450, 830, 206, 79, 847, 123, 77, 631, 703, 802, 26, 494, 569, 199, 997, 650, 554, 498, 60, 264, 866, 853, 258, 626, 62, 714, 162, 38, 923, 87, 31, 677, 719, 743, 255, 263, 571, 966, 49, 954, 556, 302, 225, 278, 171, 905, 226, 69, 784, 501, 498, 285, 759, 686, 725, 359, 970, 285, 394, 173, 574, 730, 669, 79, 7, 993, 559, 422, 346, 423, 938, 881, 383, 951, 47, 558, 976, 518, 740, 173, 496, 257, 869, 878, 496, 907, 902, 207, 30, 177, 69, 417, 418, 298, 66, 987, 628, 793, 653, 394, 865, 574, 238, 353, 392, 839, 931, 584, 114, 881, 377, 841, 932, 854, 92, 365, 423, 716, 971, 149, 1, 97, 71, 394, 270, 566, 782, 333, 945, 851, 33, 145, 391, 871, 206, 52, 478, 56, 42, 775, 242, 350, 948, 488, 547, 401, 719, 47, 761, 978, 939, 767, 279, 314, 965, 276, 560, 145, 694, 983, 261, 490, 66, 530, 928, 784, 553, 189, 678, 877, 745, 543, 278, 500, 492, 927, 30, 275, 968, 83, 905, 998, 454, 162, 466, 964, 592, 731, 192, 320, 378, 718, 964, 12, 143, 297, 647, 707, 381, 549, 872, 186, 317, 361, 388, 95, 775, 461, 564, 612, 6, 629, 967, 544, 868, 122, 210, 604, 914, 117, 653, 133, 728, 456, 915, 324, 88, 354, 554, 104, 371, 774, 742, 166, 927, 86, 220, 292, 42, 245, 349, 51, 480, 216, 581, 124, 551, 535, 274, 21, 107, 933, 373, 723, 839, 735, 91, 796, 817, 266, 419, 906, 223, 912, 968, 219, 846, 530, 391, 108, 17, 881, 364, 729, 298, 390, 944, 507, 455, 50, 875, 282, 906, 511, 340, 911, 126, 437, 478, 389, 241, 27, 943, 165, 343, 198, 693, 157, 923, 282, 220, 128, 153, 275, 386, 519, 666, 589, 117, 501, 926, 1, 253, 47, 204, 964, 952, 41, 708, 768, 211, 16, 428, 59, 185, 951, 782, 101, 217, 624, 302, 778, 716, 473, 136, 739, 254, 529, 366, 285, 575, 974, 768, 563, 508, 118, 888, 380, 136, 60, 26, 482, 965, 164, 6, 473, 232, 500, 426, 609, 957, 783, 393, 622, 812, 6, 635, 341, 391, 842, 287, 359, 1, 133, 555, 174, 676, 248, 944, 272, 703, 861, 723, 364, 598, 761, 825, 581, 125, 617, 432, 774, 650, 242, 89, 160, 850, 794, 299, 512, 564, 509, 213, 741, 334, 43, 200, 195, 57, 198, 794, 274, 959, 868, 771, 951, 42, 292, 858, 653, 29, 322, 916, 496, 805, 238, 240, 296, 318, 825, 14, 893, 904, 795, 850, 291, 70, 403, 760, 828, 797, 39, 894, 82, 569, 871, 844, 516, 446, 173, 365, 923, 657, 752, 896, 570, 411, 67, 370, 572, 831, 966, 401, 442, 175, 669, 109, 935, 808, 576, 507, 280, 714, 709, 577, 657, 662, 117, 946, 290, 564, 362, 294, 852, 942, 309, 476, 968, 887, 763, 647, 478, 374, 175, 565, 785, 284, 547, 643, 46, 48, 853, 238, 178, 380, 822, 151, 668, 195, 641, 286, 944, 402, 234, 943, 636, 962, 61, 285, 388, 288, 30, 103, 34, 779, 965, 102, 819, 55, 288, 621, 80, 237, 987, 838, 234, 447, 718, 241, 187, 562, 860, 406, 313, 103, 692, 865, 960, 110, 387, 169, 37, 759, 421, 103, 604, 467, 113, 342, 561, 240, 435, 768, 458, 70, 964, 95, 161, 230, 772, 383, 639, 455, 403, 554, 376, 94, 541, 24, 16, 520, 882, 124, 674, 241, 773, 68, 971, 428, 623, 856, 258, 788, 711, 642, 701, 37, 23, 764, 837, 533, 951, 871, 996, 974, 204, 310, 481, 477, 106, 207, 750, 736, 503, 490, 899, 420, 884, 439, 657, 461, 941, 207, 732, 362, 755, 170, 814, 220, 939, 877, 719, 727, 615, 851, 221, 986, 833, 466, 827, 667, 94, 675, 384, 639, 971, 385, 695, 938, 441, 901, 493, 657, 413, 945, 988, 103, 126, 425, 919, 341, 540, 311, 512, 83, 578, 665, 971, 738, 91, 149, 187, 287, 721, 75, 162, 617, 417, 397, 214, 839, 209, 853, 444, 133, 997, 865, 61, 651, 536, 666, 140, 58, 486, 598, 80, 351, 410, 447, 535, 717, 836, 195, 886, 309, 71, 594, 368, 989, 284, 518, 824, 282, 454, 125, 677, 21, 229, 504, 124, 408, 349, 613, 734, 519, 290, 992, 611, 583, 993, 966, 37, 757, 79, 779, 32, 444, 724, 370, 581, 676, 474, 339, 389, 487, 625, 948, 882, 700, 428, 893, 840, 56, 323, 982, 479, 152, 595, 776, 36, 220, 330, 723, 880, 404, 319, 289, 991, 786, 614, 144, 185, 128, 753, 483, 821, 945, 290, 178, 847, 283, 165, 559, 958, 322, 602, 269, 303, 718, 698, 834, 689, 417, 595, 292, 439, 523, 125, 452, 113, 701, 155, 172, 125, 492, 392, 294, 858, 869, 310, 760, 275, 352, 972, 774, 174, 997, 960, 779, 172, 609, 323, 459, 228, 620, 443, 919, 13, 158, 980, 711, 713, 971, 606, 381, 920, 39, 74, 779, 114, 899, 273, 450, 859, 945, 303, 56, 230, 202, 295, 911, 221, 391, 647, 417, 793, 400, 567, 366, 19, 647, 363, 848, 297, 185, 688, 773, 918, 833, 39, 792, 364, 56, 174, 787, 598, 787, 745, 922, 264, 903, 371, 688, 141, 608, 573, 262, 427, 531, 497, 1, 434, 978, 88, 865, 38, 378, 456, 88, 808, 657, 484, 478, 82, 946, 345, 308, 376, 779, 485, 889, 418, 680, 810, 541, 807, 826, 256, 898, 737, 315, 662, 150, 500, 398, 888, 106, 507, 927, 412, 707, 376, 184, 215, 955, 238, 214, 637, 24, 776, 734, 15, 721, 685, 741, 338, 338, 169, 930, 876, 393, 813, 165, 693, 686, 663, 279, 258, 632, 647, 689, 878, 808, 517, 402, 543, 256, 332, 248, 852, 133, 156, 359, 101, 936, 14, 189, 277, 673, 380, 678, 663, 43, 388, 434, 981, 876, 770, 224, 536, 852, 3, 395, 612, 778, 489, 284, 436, 519, 686, 136, 418, 995, 967, 492, 988, 551, 666, 543, 288, 390, 182, 490, 172, 687, 257, 493, 476, 477, 521, 429, 242, 395, 198, 289, 674, 868, 427, 712, 916, 422, 984, 865, 326, 347, 328, 589, 868, 88, 809, 499, 362, 371, 542, 503, 807, 265, 943, 59, 753, 76, 158, 293, 665, 237, 661, 24, 550, 98, 99, 651, 710, 874, 63, 777, 306, 778, 844, 457, 588, 821, 376, 947, 67, 566, 530, 866, 593, 637, 605, 778, 309, 692, 416, 276, 701, 76, 606, 797, 514, 418, 914, 570, 152, 951, 951, 276, 263, 446, 677, 240, 613, 280, 169, 242, 40, 275, 460, 286, 205, 646, 213, 49, 123, 613, 718, 15, 937, 961, 256, 748, 249, 113, 182, 117, 326, 88, 159, 778, 951, 45, 872, 655, 238, 1, 204, 717, 728, 682, 267, 832, 240, 427, 954, 106, 458, 496, 620, 679, 993, 164, 326, 595, 715, 459, 626, 40, 471, 514, 220, 918, 909, 30, 923, 477, 51, 524, 321, 450, 385, 635, 147, 974, 741, 975, 904, 348, 922, 711, 510, 581, 101, 309, 743, 530, 269, 634, 133, 360, 627, 943, 478, 3, 638, 84, 596, 273, 641, 650, 35, 283, 310, 679, 435, 890, 970, 957, 939, 916, 770, 934, 551, 41, 950, 747, 632, 360, 29, 873, 771, 794, 537, 511, 133, 716, 35, 838, 2, 390, 566, 937, 634, 84, 344, 339, 743, 6, 438, 775, 899, 524, 460, 993, 882, 491, 769, 181, 538, 895, 495, 874, 41, 430, 796, 966, 523, 70, 71, 839, 916, 188, 561, 453, 539, 268, 615, 652, 342, 800, 172, 882, 8, 534, 459, 960, 57, 841, 663, 544, 902, 596, 417, 456, 393, 646, 247, 102, 670, 611, 724, 774, 350, 527, 0, 776, 898, 561, 524, 948, 796, 846, 247, 340, 536, 293, 300, 502, 749, 85, 202, 123, 797, 461, 912, 470, 976, 287, 636, 456, 70, 877, 157, 935, 371, 503, 607, 246, 446, 20, 996, 885, 846, 113, 552, 638, 711, 702, 884, 469, 692, 163, 258, 936, 896, 167, 834, 950, 656, 83, 506, 237, 729, 96, 149, 942, 179, 428, 422, 466, 604, 293, 968, 727, 543, 513, 823, 757, 892, 54, 40, 742, 877, 73, 91, 358, 703, 467, 390, 525, 267, 327, 351, 520, 457, 141, 780, 711, 421, 73, 9, 52, 832, 143, 135, 880, 635, 699, 912, 477, 974, 109, 329, 328, 2, 229, 684, 996, 35, 824, 9, 73, 124, 794, 13, 686, 406, 741, 356, 676, 766, 148, 919, 635, 231, 210, 940, 673, 194, 111, 311, 947, 63, 421, 97, 702, 163, 71, 335, 817, 743, 309, 462, 630, 783, 916, 330, 104, 861, 924, 591, 254, 726, 40, 404, 110, 397, 29, 823, 389, 508, 279, 931, 495, 384, 923, 787, 406, 805, 928, 488, 522, 691, 738, 227, 548, 44, 205, 39, 75, 278, 730, 42, 570, 727, 797, 375, 140, 522, 298, 706, 548, 208, 364, 122, 691, 448, 750, 487, 891, 914, 126, 825, 172, 987, 68, 111, 900, 217, 922, 923, 19, 579, 163, 783, 425, 430, 364, 617, 905, 747, 390, 743, 442, 657, 961, 949, 663, 470, 323, 742, 611, 470, 350, 600, 66, 458, 34, 112, 139, 625, 6, 211, 912, 685, 391, 341, 514, 301, 67, 250, 103, 766, 126, 312, 912, 579, 144, 718, 659, 27, 675, 605, 368, 134, 253, 226, 865, 376, 44, 544, 5, 366, 242, 227, 978, 313, 206, 874, 896, 438, 351, 439, 202, 676, 787, 253, 385, 948, 765, 746, 862, 982, 31, 946, 912, 202, 316, 113, 969, 439, 318, 402, 680, 319, 687, 290, 623, 9, 725, 602, 717, 633, 762, 360, 941, 82, 381, 369, 152, 116, 2, 392, 450, 641, 636, 7, 775, 798, 961, 754, 142, 997, 284, 979, 199, 409, 338, 864, 626, 446, 343, 490, 176, 703, 187, 409, 78, 447, 162, 162, 904, 201, 157, 324, 912, 176, 838, 205, 378, 320, 909, 63, 388, 528, 212, 737, 105, 106, 63, 956, 579, 956, 939, 173, 746, 53, 333, 665, 396, 698, 394, 832, 513, 721, 703, 49, 612, 280, 412, 192, 366, 139, 790, 962, 79, 369, 114, 424, 355, 193, 766, 766, 570, 326, 330, 142, 646, 502, 470, 600, 948, 73, 371, 516, 62, 475, 582, 686, 602, 92, 143, 157, 207, 541, 6, 215, 330, 688, 881, 440, 481, 770, 814, 586, 129, 837, 976, 176, 555, 356, 407, 43, 566, 231, 677, 784, 131, 677, 753, 989, 683, 356, 652, 383, 37, 927, 837, 519, 622, 719, 674, 458, 992, 514, 708, 951, 409, 551, 931, 14, 588, 722, 738, 392, 602, 597, 712, 379, 326, 343, 991, 622, 723, 837, 478, 53, 755, 257, 807, 838, 682, 232, 569, 291, 37, 186, 6, 37, 632, 852, 50, 296, 513, 88, 318, 75, 939, 972, 450, 213, 64, 922, 932, 684, 216, 989, 405, 306, 364, 749, 290, 991, 608, 268, 445, 11, 309, 393, 500, 310, 769, 241, 440, 737, 219, 136, 4, 262, 233, 377, 461, 609, 602, 181, 375, 485, 99, 866, 43, 542, 569, 823, 371, 489, 243, 110, 127, 317, 201, 594, 631, 427, 488, 368, 170, 560, 439, 822, 639, 827, 422, 164, 174, 796, 323, 336, 826, 567, 813, 290, 653, 977, 624, 295, 958, 623, 804, 512, 780, 150, 216, 362, 170, 383, 332, 328, 218, 175, 718, 689, 285, 559, 470, 362, 397, 648, 263, 441, 298, 978, 618, 262, 233, 449, 421, 830, 141, 797, 755, 181, 546, 568, 622, 889, 134, 914, 167, 199, 679, 113, 633, 444, 713, 626, 372, 285, 82, 681, 900, 17, 357, 802, 156, 635, 841, 476, 837, 632, 804, 119, 935, 499, 439, 855, 363, 747, 963, 144, 866, 833, 221, 204, 262, 776, 133, 287, 405, 379, 340, 294, 181, 939, 423, 928, 264, 20, 176, 557, 332, 394, 482, 238, 934, 504, 485, 899, 211, 895, 942, 483, 246, 894, 782, 7, 905, 430, 185, 849, 629, 329, 710, 265, 806, 567, 314, 77, 37, 955, 409, 732, 789, 492, 474, 428, 717, 115, 117, 803, 175, 942, 875, 780, 259, 149, 532, 494, 53, 525, 168, 887, 633, 410, 676, 491, 761, 133, 49, 75, 145, 323, 258, 387, 612, 432, 205, 925, 502, 611, 809, 755, 163, 650, 3, 721, 431, 9, 74, 977, 608, 129, 531, 699, 545, 87, 431, 981, 97, 371, 888, 377, 392, 12, 322, 306, 68, 548, 831, 516, 885, 361, 976, 148, 881, 697, 183, 476, 549, 320, 896, 291, 352, 78, 607, 20, 274, 873, 894, 102, 967, 405, 638, 846, 530, 831, 657, 982, 884, 946, 105, 378, 217, 795, 111, 946, 998, 685, 308, 601, 598, 397, 78, 223, 668, 46, 594, 985, 17, 426, 979, 70, 905, 879, 196, 770, 327, 679, 604, 169, 91, 700, 483, 158, 227, 639, 179, 303, 545, 397, 980, 189, 954, 323, 244, 197, 509, 870, 796, 341, 9, 906, 111, 695, 360, 342, 348, 142, 875, 955, 873, 688, 119, 302, 488, 316, 904, 386, 253, 432, 582, 308, 430, 264, 817, 483, 770, 196, 618, 119, 108, 909, 520, 575, 990, 373, 474, 884, 819, 184, 157, 226, 867, 484, 141, 353, 317, 710, 616, 29, 415, 722, 97, 342, 699, 436, 906, 354, 231, 951, 996, 916, 745, 292, 110, 649, 610, 327, 121, 18, 566, 118, 857
        });
//        System.out.print(System.currentTimeMillis() - time + "\n");
        for (int a : arr) {
            System.out.print(a + " ");
        }
    }

    public static int[] sort(int[] array) {
        int size = array.length;
        if (size <= 1) return array;
        for (int i = 1; i < size; i *= 2) {
            for (int j = 0; j < size - i; j += 2 * i) {
                array = combine(array, j, j + i, Math.min(j + 2 * i, size));
            }
        }
        return array;
    }

    public static int[] combine(int[] array, int start, int middle, int end) {
        int a[] = new int[end - start];
        int f = start, s = middle;
        for (int i = 0; i < a.length; i++) {
            if (f >= middle) {
                a[i] = array[s];
                s++;
            } else if (s >= end) {
                a[i] = array[f];
                f++;
            } else if (array[f] < array[s]) {
                a[i] = array[f];
                f++;
            } else {
                a[i] = array[s];
                s++;
            }
        }
        for (int i = 0; i < a.length; i++) {
            array[i + start] = a[i];
        }
        return array;
    }
}