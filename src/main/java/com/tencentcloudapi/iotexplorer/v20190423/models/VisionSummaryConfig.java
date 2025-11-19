/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.iotexplorer.v20190423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VisionSummaryConfig extends AbstractModel {

    /**
    * 主输出语言，可选值包括：
- `zh` 中文（默认值）
- `en` 英语
- `ja` 日语
- `ko` 韩文
- `pt-BR` 葡萄牙语（巴西）
- `th` 泰语
- `ms` 马来语
    */
    @SerializedName("OutputLang")
    @Expose
    private String OutputLang;

    /**
    * 次选输出语言，可选值包括：
- `zh` 中文
- `en` 英语
- `ja` 日语
- `ko` 韩文
- `pt-BR` 葡萄牙语（巴西）
- `th` 泰语
- `ms` 马来语

    */
    @SerializedName("AlternativeOutputLang")
    @Expose
    private String AlternativeOutputLang;

    /**
    * 多摄像头布局定义。可选值包括：

- 单摄（默认值）：`Single`

- 双摄（纵向排列）- 全部画面：`Vertical,Num=2,Index=0;1`
- 双摄（纵向排列）- 画面1：`Vertical,Num=2,Index=0`
- 双摄（纵向排列）- 画面2：`Vertical,Num=2,Index=1`

- 三摄（纵向排列）- 全部画面：`Vertical,Num=3,Index=0;1;2`
- 三摄（纵向排列）- 画面1：`Vertical,Num=3,Index=0`
- 三摄（纵向排列）- 画面2：`Vertical,Num=3,Index=1`
- 三摄（纵向排列）- 画面3：`Vertical,Num=3,Index=2`
- 三摄（纵向排列）- 画面1+2：`Vertical,Num=3,Index=0;1`
- 三摄（纵向排列）- 画面1+3：`Vertical,Num=3,Index=0;2`
- 三摄（纵向排列）- 画面2+3：`Vertical,Num=3,Index=1;2`
    */
    @SerializedName("MultiCameraLayout")
    @Expose
    private String MultiCameraLayout;

    /**
    * 拓展的目标及事件检测类别。可选值包括：

**通用事件标签**
- `person_enter` 有人进入
- `vehicle_entering` 车辆进入
- `vehicle_parking` 车辆停靠
- `pet` 有宠物
- `no_signal` 视频画面异常（无信号等）

**看家护院**
- `person_climbing_fence` 有人翻围墙
- `door_window_open` 门窗被开启
- `person_carrying_object` 有人搬运物品

**商铺看管**
- `person_at_cashier` 有人在收银台
- `person_taking_goods` 有人拿商品
- `person_night_moving` 夜间有人移动

**公共及防火安全**
- `person_stealing` 有人偷盗
- `crowd` 多人聚集
- `smoking` 有人吸烟
- `safety_fire` 明火
- `safety_smoke` 浓烟
- `fireworks` 有人燃放烟花爆竹
- `knife` 有人持刀
- `gun` 有人持枪
- `fight` 有人打架
- `hurt` 有人受伤流血

**养殖看护**
- `person_feeding_animal` 有人投喂牲畜
- `animal_lying` 有动物躺地上
- `animal_wild_intrusion` 野生动物入侵

**果园农田**
- `person_picking_fruit` 有人采摘果实
- `person_carrying_bag` 有人携带包裹

**鱼塘看管**
- `fishing` 有人钓鱼
- `net_fishing` 有人撒网
- `person_carrying_fishing_gear` 有人携带渔具
- `loitering_near_water` 有人岸边逗留
- `throwing_into_water` 有人投掷物品

**婴儿看护**
- `baby` 有婴儿
- `baby_dropping` 婴儿跌落床铺
- `person_holding_baby` 有人抱起婴儿
- `baby_rolling` 婴儿翻滚
- `baby_crying` 婴儿哭闹

**儿童看护**
- `child` 有小孩
- `child_falling` 小孩摔倒
- `child_entering_kitchen` 小孩进入厨房
- `child_climbing_window` 小孩攀爬室内窗户
- `child_near_water` 小孩靠近水域

**老人看护**
- `elderly` 有老人
- `elderly_falling` 老人摔倒
- `elderly_eating` 老人用餐
- `elderly_using_stove` 老人使用灶具

**宠物看护**
- `pet_eating` 宠物进食
- `pet_damaging` 宠物损坏家具
- `pet_barking` 宠物吠叫
- `pet_scratching_door` 宠物挠门
	
    */
    @SerializedName("DetectTypes")
    @Expose
    private String [] DetectTypes;

    /**
    * 自定义检测标签
    */
    @SerializedName("CustomDetectQueries")
    @Expose
    private VisionCustomDetectQuery [] CustomDetectQueries;

    /**
     * Get 主输出语言，可选值包括：
- `zh` 中文（默认值）
- `en` 英语
- `ja` 日语
- `ko` 韩文
- `pt-BR` 葡萄牙语（巴西）
- `th` 泰语
- `ms` 马来语 
     * @return OutputLang 主输出语言，可选值包括：
- `zh` 中文（默认值）
- `en` 英语
- `ja` 日语
- `ko` 韩文
- `pt-BR` 葡萄牙语（巴西）
- `th` 泰语
- `ms` 马来语
     */
    public String getOutputLang() {
        return this.OutputLang;
    }

    /**
     * Set 主输出语言，可选值包括：
- `zh` 中文（默认值）
- `en` 英语
- `ja` 日语
- `ko` 韩文
- `pt-BR` 葡萄牙语（巴西）
- `th` 泰语
- `ms` 马来语
     * @param OutputLang 主输出语言，可选值包括：
- `zh` 中文（默认值）
- `en` 英语
- `ja` 日语
- `ko` 韩文
- `pt-BR` 葡萄牙语（巴西）
- `th` 泰语
- `ms` 马来语
     */
    public void setOutputLang(String OutputLang) {
        this.OutputLang = OutputLang;
    }

    /**
     * Get 次选输出语言，可选值包括：
- `zh` 中文
- `en` 英语
- `ja` 日语
- `ko` 韩文
- `pt-BR` 葡萄牙语（巴西）
- `th` 泰语
- `ms` 马来语
 
     * @return AlternativeOutputLang 次选输出语言，可选值包括：
- `zh` 中文
- `en` 英语
- `ja` 日语
- `ko` 韩文
- `pt-BR` 葡萄牙语（巴西）
- `th` 泰语
- `ms` 马来语

     */
    public String getAlternativeOutputLang() {
        return this.AlternativeOutputLang;
    }

    /**
     * Set 次选输出语言，可选值包括：
- `zh` 中文
- `en` 英语
- `ja` 日语
- `ko` 韩文
- `pt-BR` 葡萄牙语（巴西）
- `th` 泰语
- `ms` 马来语

     * @param AlternativeOutputLang 次选输出语言，可选值包括：
- `zh` 中文
- `en` 英语
- `ja` 日语
- `ko` 韩文
- `pt-BR` 葡萄牙语（巴西）
- `th` 泰语
- `ms` 马来语

     */
    public void setAlternativeOutputLang(String AlternativeOutputLang) {
        this.AlternativeOutputLang = AlternativeOutputLang;
    }

    /**
     * Get 多摄像头布局定义。可选值包括：

- 单摄（默认值）：`Single`

- 双摄（纵向排列）- 全部画面：`Vertical,Num=2,Index=0;1`
- 双摄（纵向排列）- 画面1：`Vertical,Num=2,Index=0`
- 双摄（纵向排列）- 画面2：`Vertical,Num=2,Index=1`

- 三摄（纵向排列）- 全部画面：`Vertical,Num=3,Index=0;1;2`
- 三摄（纵向排列）- 画面1：`Vertical,Num=3,Index=0`
- 三摄（纵向排列）- 画面2：`Vertical,Num=3,Index=1`
- 三摄（纵向排列）- 画面3：`Vertical,Num=3,Index=2`
- 三摄（纵向排列）- 画面1+2：`Vertical,Num=3,Index=0;1`
- 三摄（纵向排列）- 画面1+3：`Vertical,Num=3,Index=0;2`
- 三摄（纵向排列）- 画面2+3：`Vertical,Num=3,Index=1;2` 
     * @return MultiCameraLayout 多摄像头布局定义。可选值包括：

- 单摄（默认值）：`Single`

- 双摄（纵向排列）- 全部画面：`Vertical,Num=2,Index=0;1`
- 双摄（纵向排列）- 画面1：`Vertical,Num=2,Index=0`
- 双摄（纵向排列）- 画面2：`Vertical,Num=2,Index=1`

- 三摄（纵向排列）- 全部画面：`Vertical,Num=3,Index=0;1;2`
- 三摄（纵向排列）- 画面1：`Vertical,Num=3,Index=0`
- 三摄（纵向排列）- 画面2：`Vertical,Num=3,Index=1`
- 三摄（纵向排列）- 画面3：`Vertical,Num=3,Index=2`
- 三摄（纵向排列）- 画面1+2：`Vertical,Num=3,Index=0;1`
- 三摄（纵向排列）- 画面1+3：`Vertical,Num=3,Index=0;2`
- 三摄（纵向排列）- 画面2+3：`Vertical,Num=3,Index=1;2`
     */
    public String getMultiCameraLayout() {
        return this.MultiCameraLayout;
    }

    /**
     * Set 多摄像头布局定义。可选值包括：

- 单摄（默认值）：`Single`

- 双摄（纵向排列）- 全部画面：`Vertical,Num=2,Index=0;1`
- 双摄（纵向排列）- 画面1：`Vertical,Num=2,Index=0`
- 双摄（纵向排列）- 画面2：`Vertical,Num=2,Index=1`

- 三摄（纵向排列）- 全部画面：`Vertical,Num=3,Index=0;1;2`
- 三摄（纵向排列）- 画面1：`Vertical,Num=3,Index=0`
- 三摄（纵向排列）- 画面2：`Vertical,Num=3,Index=1`
- 三摄（纵向排列）- 画面3：`Vertical,Num=3,Index=2`
- 三摄（纵向排列）- 画面1+2：`Vertical,Num=3,Index=0;1`
- 三摄（纵向排列）- 画面1+3：`Vertical,Num=3,Index=0;2`
- 三摄（纵向排列）- 画面2+3：`Vertical,Num=3,Index=1;2`
     * @param MultiCameraLayout 多摄像头布局定义。可选值包括：

- 单摄（默认值）：`Single`

- 双摄（纵向排列）- 全部画面：`Vertical,Num=2,Index=0;1`
- 双摄（纵向排列）- 画面1：`Vertical,Num=2,Index=0`
- 双摄（纵向排列）- 画面2：`Vertical,Num=2,Index=1`

- 三摄（纵向排列）- 全部画面：`Vertical,Num=3,Index=0;1;2`
- 三摄（纵向排列）- 画面1：`Vertical,Num=3,Index=0`
- 三摄（纵向排列）- 画面2：`Vertical,Num=3,Index=1`
- 三摄（纵向排列）- 画面3：`Vertical,Num=3,Index=2`
- 三摄（纵向排列）- 画面1+2：`Vertical,Num=3,Index=0;1`
- 三摄（纵向排列）- 画面1+3：`Vertical,Num=3,Index=0;2`
- 三摄（纵向排列）- 画面2+3：`Vertical,Num=3,Index=1;2`
     */
    public void setMultiCameraLayout(String MultiCameraLayout) {
        this.MultiCameraLayout = MultiCameraLayout;
    }

    /**
     * Get 拓展的目标及事件检测类别。可选值包括：

**通用事件标签**
- `person_enter` 有人进入
- `vehicle_entering` 车辆进入
- `vehicle_parking` 车辆停靠
- `pet` 有宠物
- `no_signal` 视频画面异常（无信号等）

**看家护院**
- `person_climbing_fence` 有人翻围墙
- `door_window_open` 门窗被开启
- `person_carrying_object` 有人搬运物品

**商铺看管**
- `person_at_cashier` 有人在收银台
- `person_taking_goods` 有人拿商品
- `person_night_moving` 夜间有人移动

**公共及防火安全**
- `person_stealing` 有人偷盗
- `crowd` 多人聚集
- `smoking` 有人吸烟
- `safety_fire` 明火
- `safety_smoke` 浓烟
- `fireworks` 有人燃放烟花爆竹
- `knife` 有人持刀
- `gun` 有人持枪
- `fight` 有人打架
- `hurt` 有人受伤流血

**养殖看护**
- `person_feeding_animal` 有人投喂牲畜
- `animal_lying` 有动物躺地上
- `animal_wild_intrusion` 野生动物入侵

**果园农田**
- `person_picking_fruit` 有人采摘果实
- `person_carrying_bag` 有人携带包裹

**鱼塘看管**
- `fishing` 有人钓鱼
- `net_fishing` 有人撒网
- `person_carrying_fishing_gear` 有人携带渔具
- `loitering_near_water` 有人岸边逗留
- `throwing_into_water` 有人投掷物品

**婴儿看护**
- `baby` 有婴儿
- `baby_dropping` 婴儿跌落床铺
- `person_holding_baby` 有人抱起婴儿
- `baby_rolling` 婴儿翻滚
- `baby_crying` 婴儿哭闹

**儿童看护**
- `child` 有小孩
- `child_falling` 小孩摔倒
- `child_entering_kitchen` 小孩进入厨房
- `child_climbing_window` 小孩攀爬室内窗户
- `child_near_water` 小孩靠近水域

**老人看护**
- `elderly` 有老人
- `elderly_falling` 老人摔倒
- `elderly_eating` 老人用餐
- `elderly_using_stove` 老人使用灶具

**宠物看护**
- `pet_eating` 宠物进食
- `pet_damaging` 宠物损坏家具
- `pet_barking` 宠物吠叫
- `pet_scratching_door` 宠物挠门
	 
     * @return DetectTypes 拓展的目标及事件检测类别。可选值包括：

**通用事件标签**
- `person_enter` 有人进入
- `vehicle_entering` 车辆进入
- `vehicle_parking` 车辆停靠
- `pet` 有宠物
- `no_signal` 视频画面异常（无信号等）

**看家护院**
- `person_climbing_fence` 有人翻围墙
- `door_window_open` 门窗被开启
- `person_carrying_object` 有人搬运物品

**商铺看管**
- `person_at_cashier` 有人在收银台
- `person_taking_goods` 有人拿商品
- `person_night_moving` 夜间有人移动

**公共及防火安全**
- `person_stealing` 有人偷盗
- `crowd` 多人聚集
- `smoking` 有人吸烟
- `safety_fire` 明火
- `safety_smoke` 浓烟
- `fireworks` 有人燃放烟花爆竹
- `knife` 有人持刀
- `gun` 有人持枪
- `fight` 有人打架
- `hurt` 有人受伤流血

**养殖看护**
- `person_feeding_animal` 有人投喂牲畜
- `animal_lying` 有动物躺地上
- `animal_wild_intrusion` 野生动物入侵

**果园农田**
- `person_picking_fruit` 有人采摘果实
- `person_carrying_bag` 有人携带包裹

**鱼塘看管**
- `fishing` 有人钓鱼
- `net_fishing` 有人撒网
- `person_carrying_fishing_gear` 有人携带渔具
- `loitering_near_water` 有人岸边逗留
- `throwing_into_water` 有人投掷物品

**婴儿看护**
- `baby` 有婴儿
- `baby_dropping` 婴儿跌落床铺
- `person_holding_baby` 有人抱起婴儿
- `baby_rolling` 婴儿翻滚
- `baby_crying` 婴儿哭闹

**儿童看护**
- `child` 有小孩
- `child_falling` 小孩摔倒
- `child_entering_kitchen` 小孩进入厨房
- `child_climbing_window` 小孩攀爬室内窗户
- `child_near_water` 小孩靠近水域

**老人看护**
- `elderly` 有老人
- `elderly_falling` 老人摔倒
- `elderly_eating` 老人用餐
- `elderly_using_stove` 老人使用灶具

**宠物看护**
- `pet_eating` 宠物进食
- `pet_damaging` 宠物损坏家具
- `pet_barking` 宠物吠叫
- `pet_scratching_door` 宠物挠门
	
     */
    public String [] getDetectTypes() {
        return this.DetectTypes;
    }

    /**
     * Set 拓展的目标及事件检测类别。可选值包括：

**通用事件标签**
- `person_enter` 有人进入
- `vehicle_entering` 车辆进入
- `vehicle_parking` 车辆停靠
- `pet` 有宠物
- `no_signal` 视频画面异常（无信号等）

**看家护院**
- `person_climbing_fence` 有人翻围墙
- `door_window_open` 门窗被开启
- `person_carrying_object` 有人搬运物品

**商铺看管**
- `person_at_cashier` 有人在收银台
- `person_taking_goods` 有人拿商品
- `person_night_moving` 夜间有人移动

**公共及防火安全**
- `person_stealing` 有人偷盗
- `crowd` 多人聚集
- `smoking` 有人吸烟
- `safety_fire` 明火
- `safety_smoke` 浓烟
- `fireworks` 有人燃放烟花爆竹
- `knife` 有人持刀
- `gun` 有人持枪
- `fight` 有人打架
- `hurt` 有人受伤流血

**养殖看护**
- `person_feeding_animal` 有人投喂牲畜
- `animal_lying` 有动物躺地上
- `animal_wild_intrusion` 野生动物入侵

**果园农田**
- `person_picking_fruit` 有人采摘果实
- `person_carrying_bag` 有人携带包裹

**鱼塘看管**
- `fishing` 有人钓鱼
- `net_fishing` 有人撒网
- `person_carrying_fishing_gear` 有人携带渔具
- `loitering_near_water` 有人岸边逗留
- `throwing_into_water` 有人投掷物品

**婴儿看护**
- `baby` 有婴儿
- `baby_dropping` 婴儿跌落床铺
- `person_holding_baby` 有人抱起婴儿
- `baby_rolling` 婴儿翻滚
- `baby_crying` 婴儿哭闹

**儿童看护**
- `child` 有小孩
- `child_falling` 小孩摔倒
- `child_entering_kitchen` 小孩进入厨房
- `child_climbing_window` 小孩攀爬室内窗户
- `child_near_water` 小孩靠近水域

**老人看护**
- `elderly` 有老人
- `elderly_falling` 老人摔倒
- `elderly_eating` 老人用餐
- `elderly_using_stove` 老人使用灶具

**宠物看护**
- `pet_eating` 宠物进食
- `pet_damaging` 宠物损坏家具
- `pet_barking` 宠物吠叫
- `pet_scratching_door` 宠物挠门
	
     * @param DetectTypes 拓展的目标及事件检测类别。可选值包括：

**通用事件标签**
- `person_enter` 有人进入
- `vehicle_entering` 车辆进入
- `vehicle_parking` 车辆停靠
- `pet` 有宠物
- `no_signal` 视频画面异常（无信号等）

**看家护院**
- `person_climbing_fence` 有人翻围墙
- `door_window_open` 门窗被开启
- `person_carrying_object` 有人搬运物品

**商铺看管**
- `person_at_cashier` 有人在收银台
- `person_taking_goods` 有人拿商品
- `person_night_moving` 夜间有人移动

**公共及防火安全**
- `person_stealing` 有人偷盗
- `crowd` 多人聚集
- `smoking` 有人吸烟
- `safety_fire` 明火
- `safety_smoke` 浓烟
- `fireworks` 有人燃放烟花爆竹
- `knife` 有人持刀
- `gun` 有人持枪
- `fight` 有人打架
- `hurt` 有人受伤流血

**养殖看护**
- `person_feeding_animal` 有人投喂牲畜
- `animal_lying` 有动物躺地上
- `animal_wild_intrusion` 野生动物入侵

**果园农田**
- `person_picking_fruit` 有人采摘果实
- `person_carrying_bag` 有人携带包裹

**鱼塘看管**
- `fishing` 有人钓鱼
- `net_fishing` 有人撒网
- `person_carrying_fishing_gear` 有人携带渔具
- `loitering_near_water` 有人岸边逗留
- `throwing_into_water` 有人投掷物品

**婴儿看护**
- `baby` 有婴儿
- `baby_dropping` 婴儿跌落床铺
- `person_holding_baby` 有人抱起婴儿
- `baby_rolling` 婴儿翻滚
- `baby_crying` 婴儿哭闹

**儿童看护**
- `child` 有小孩
- `child_falling` 小孩摔倒
- `child_entering_kitchen` 小孩进入厨房
- `child_climbing_window` 小孩攀爬室内窗户
- `child_near_water` 小孩靠近水域

**老人看护**
- `elderly` 有老人
- `elderly_falling` 老人摔倒
- `elderly_eating` 老人用餐
- `elderly_using_stove` 老人使用灶具

**宠物看护**
- `pet_eating` 宠物进食
- `pet_damaging` 宠物损坏家具
- `pet_barking` 宠物吠叫
- `pet_scratching_door` 宠物挠门
	
     */
    public void setDetectTypes(String [] DetectTypes) {
        this.DetectTypes = DetectTypes;
    }

    /**
     * Get 自定义检测标签 
     * @return CustomDetectQueries 自定义检测标签
     */
    public VisionCustomDetectQuery [] getCustomDetectQueries() {
        return this.CustomDetectQueries;
    }

    /**
     * Set 自定义检测标签
     * @param CustomDetectQueries 自定义检测标签
     */
    public void setCustomDetectQueries(VisionCustomDetectQuery [] CustomDetectQueries) {
        this.CustomDetectQueries = CustomDetectQueries;
    }

    public VisionSummaryConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VisionSummaryConfig(VisionSummaryConfig source) {
        if (source.OutputLang != null) {
            this.OutputLang = new String(source.OutputLang);
        }
        if (source.AlternativeOutputLang != null) {
            this.AlternativeOutputLang = new String(source.AlternativeOutputLang);
        }
        if (source.MultiCameraLayout != null) {
            this.MultiCameraLayout = new String(source.MultiCameraLayout);
        }
        if (source.DetectTypes != null) {
            this.DetectTypes = new String[source.DetectTypes.length];
            for (int i = 0; i < source.DetectTypes.length; i++) {
                this.DetectTypes[i] = new String(source.DetectTypes[i]);
            }
        }
        if (source.CustomDetectQueries != null) {
            this.CustomDetectQueries = new VisionCustomDetectQuery[source.CustomDetectQueries.length];
            for (int i = 0; i < source.CustomDetectQueries.length; i++) {
                this.CustomDetectQueries[i] = new VisionCustomDetectQuery(source.CustomDetectQueries[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OutputLang", this.OutputLang);
        this.setParamSimple(map, prefix + "AlternativeOutputLang", this.AlternativeOutputLang);
        this.setParamSimple(map, prefix + "MultiCameraLayout", this.MultiCameraLayout);
        this.setParamArraySimple(map, prefix + "DetectTypes.", this.DetectTypes);
        this.setParamArrayObj(map, prefix + "CustomDetectQueries.", this.CustomDetectQueries);

    }
}

