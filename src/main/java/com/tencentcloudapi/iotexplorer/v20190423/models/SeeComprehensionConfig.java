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

public class SeeComprehensionConfig extends AbstractModel {

    /**
    * <p>拓展的目标及事件检测类别<br>枚举值：</p><ul><li>person：人</li><li>vehicle：车辆</li><li>cat：猫</li><li>dog：狗</li><li>package：快递包裹</li><li>license_plate：车牌</li><li>fire：火焰</li><li>smoke：烟雾</li><li>delivery_man：快递员/外卖员</li><li>pet：有宠物</li><li>pet_scratching_door：宠物挠门</li><li>pet_barking：宠物吠叫</li><li>pet_damaging：宠物损坏家具</li><li>pet_eating：宠物进食</li><li>person_playing_with_pet：人与宠物玩耍</li><li>pet_close_to_camera：宠物靠近摄像头</li><li>animal_lying：有动物躺/趴在地上</li><li>child：有小孩</li><li>child_near_water：小孩靠近水域</li><li>child_falling：小孩摔倒</li><li>child_climbing_window：小孩攀爬室内窗户</li><li>child_entering_kitchen：小孩进入厨房</li><li>child_playing_danger_item：小孩玩危险物品</li><li>child_writing：小孩写作业</li><li>baby：有婴儿</li><li>baby_crying：婴儿哭闹</li><li>baby_dropping：婴儿跌落床铺</li><li>person_holding_baby：有人抱起婴儿</li><li>baby_rolling：婴儿翻滚</li><li>elderly：有老人</li><li>elderly_falling：老人摔倒</li><li>elderly_eating：老人用餐</li><li>elderly_using_stove：老人使用灶具</li><li>vehicle_parking：车辆停靠</li><li>vehicle_entering：车辆进入</li><li>vehicle_exiting：车辆离开</li><li>person_feeding_animal：有人投喂牲畜</li><li>animal_wild_intrusion：野生动物入侵</li><li>throwing_into_water：有人投掷物品</li><li>loitering_near_water：有人岸边逗留</li><li>fishing：有人钓鱼</li><li>net_fishing：有人撒网</li><li>person_carrying_fishing_gear：有人携带渔具</li><li>person_carrying_object：有人搬运物品</li><li>person_taking_goods：有人拿商品</li><li>person_night_moving：夜间有人移动</li><li>crowd：多人聚集</li><li>person_picking_fruit：有人采摘果实</li><li>person_at_cashier：有人在收银台</li><li>person_climbing_fence：有人翻围墙</li><li>person_carrying_bag：有人携带包裹</li><li>person_entering_farm：人员进入农场</li><li>person_entering_store：人员进入店铺</li><li>person_falling：有人跌倒</li><li>staff_absent：员工离岗</li><li>uniform_abnormal：未穿工服</li><li>using_mobile_phone：使用手机</li><li>smoking：有人吸烟</li><li>knife：有人持刀</li><li>gun：有人持枪</li><li>hurt：有人受伤流血</li><li>fight：有人打架</li><li>door_window_open：门窗被开启</li><li>fireworks：有人燃放烟花爆竹</li><li>no_signal：视频画面异常（无信号等）</li><li>camera_angle_abnormal：摄像头角度异常</li><li>person_motionless：有人且其姿势保持静止</li></ul>
    */
    @SerializedName("DetectTypes")
    @Expose
    private String [] DetectTypes;

    /**
    * <p>使该视频 / 图片录入搜索库，后续可进行搜索</p>
    */
    @SerializedName("EnableSearch")
    @Expose
    private Boolean EnableSearch;

    /**
    * <p>主输出语言，可选值包括：</p><ul><li><code>zh</code> 中文（默认值）</li><li><code>en</code> 英语</li><li><code>ja</code> 日语</li><li><code>ko</code> 韩文</li><li><code>pt-BR</code> 葡萄牙语（巴西）</li><li><code>th</code> 泰语</li><li><code>ms</code> 马来语</li></ul>
    */
    @SerializedName("OutputLang")
    @Expose
    private String OutputLang;

    /**
    * <p>次选输出语言，可选值包括：</p><ul><li><code>zh</code> 中文</li><li><code>en</code> 英语</li><li><code>ja</code> 日语</li><li><code>ko</code> 韩文</li><li><code>pt-BR</code> 葡萄牙语（巴西）</li><li><code>th</code> 泰语</li><li><code>ms</code> 马来语</li></ul>
    */
    @SerializedName("AlternativeOutputLang")
    @Expose
    private String AlternativeOutputLang;

    /**
    * <p>多摄像头布局定义。可选值包括：</p><ul><li><p>单摄（默认值）：<code>Single</code></p></li><li><p>双摄（纵向排列）- 全部画面：<code>Vertical,Num=2,Index=0;1</code></p></li><li><p>双摄（纵向排列）- 画面1：<code>Vertical,Num=2,Index=0</code></p></li><li><p>双摄（纵向排列）- 画面2：<code>Vertical,Num=2,Index=1</code></p></li><li><p>三摄（纵向排列）- 全部画面：<code>Vertical,Num=3,Index=0;1;2</code></p></li><li><p>三摄（纵向排列）- 画面1：<code>Vertical,Num=3,Index=0</code></p></li><li><p>三摄（纵向排列）- 画面2：<code>Vertical,Num=3,Index=1</code></p></li><li><p>三摄（纵向排列）- 画面3：<code>Vertical,Num=3,Index=2</code></p></li><li><p>三摄（纵向排列）- 画面1+2：<code>Vertical,Num=3,Index=0;1</code></p></li><li><p>三摄（纵向排列）- 画面1+3：<code>Vertical,Num=3,Index=0;2</code></p></li><li><p>三摄（纵向排列）- 画面2+3：<code>Vertical,Num=3,Index=1;2</code></p></li></ul>
    */
    @SerializedName("MultiCameraLayout")
    @Expose
    private String MultiCameraLayout;

    /**
    * <p>自定义检测标签</p>
    */
    @SerializedName("CustomDetectQueries")
    @Expose
    private VisionCustomDetectQuery [] CustomDetectQueries;

    /**
    * <p>最大处理的输入视频时长，单位：秒（仅对视频输入生效）</p>
    */
    @SerializedName("MaxDuration")
    @Expose
    private Long MaxDuration;

    /**
    * <p>是否生成关键词</p><p>默认值：false</p>
    */
    @SerializedName("EnableKeywords")
    @Expose
    private Boolean EnableKeywords;

    /**
     * Get <p>拓展的目标及事件检测类别<br>枚举值：</p><ul><li>person：人</li><li>vehicle：车辆</li><li>cat：猫</li><li>dog：狗</li><li>package：快递包裹</li><li>license_plate：车牌</li><li>fire：火焰</li><li>smoke：烟雾</li><li>delivery_man：快递员/外卖员</li><li>pet：有宠物</li><li>pet_scratching_door：宠物挠门</li><li>pet_barking：宠物吠叫</li><li>pet_damaging：宠物损坏家具</li><li>pet_eating：宠物进食</li><li>person_playing_with_pet：人与宠物玩耍</li><li>pet_close_to_camera：宠物靠近摄像头</li><li>animal_lying：有动物躺/趴在地上</li><li>child：有小孩</li><li>child_near_water：小孩靠近水域</li><li>child_falling：小孩摔倒</li><li>child_climbing_window：小孩攀爬室内窗户</li><li>child_entering_kitchen：小孩进入厨房</li><li>child_playing_danger_item：小孩玩危险物品</li><li>child_writing：小孩写作业</li><li>baby：有婴儿</li><li>baby_crying：婴儿哭闹</li><li>baby_dropping：婴儿跌落床铺</li><li>person_holding_baby：有人抱起婴儿</li><li>baby_rolling：婴儿翻滚</li><li>elderly：有老人</li><li>elderly_falling：老人摔倒</li><li>elderly_eating：老人用餐</li><li>elderly_using_stove：老人使用灶具</li><li>vehicle_parking：车辆停靠</li><li>vehicle_entering：车辆进入</li><li>vehicle_exiting：车辆离开</li><li>person_feeding_animal：有人投喂牲畜</li><li>animal_wild_intrusion：野生动物入侵</li><li>throwing_into_water：有人投掷物品</li><li>loitering_near_water：有人岸边逗留</li><li>fishing：有人钓鱼</li><li>net_fishing：有人撒网</li><li>person_carrying_fishing_gear：有人携带渔具</li><li>person_carrying_object：有人搬运物品</li><li>person_taking_goods：有人拿商品</li><li>person_night_moving：夜间有人移动</li><li>crowd：多人聚集</li><li>person_picking_fruit：有人采摘果实</li><li>person_at_cashier：有人在收银台</li><li>person_climbing_fence：有人翻围墙</li><li>person_carrying_bag：有人携带包裹</li><li>person_entering_farm：人员进入农场</li><li>person_entering_store：人员进入店铺</li><li>person_falling：有人跌倒</li><li>staff_absent：员工离岗</li><li>uniform_abnormal：未穿工服</li><li>using_mobile_phone：使用手机</li><li>smoking：有人吸烟</li><li>knife：有人持刀</li><li>gun：有人持枪</li><li>hurt：有人受伤流血</li><li>fight：有人打架</li><li>door_window_open：门窗被开启</li><li>fireworks：有人燃放烟花爆竹</li><li>no_signal：视频画面异常（无信号等）</li><li>camera_angle_abnormal：摄像头角度异常</li><li>person_motionless：有人且其姿势保持静止</li></ul> 
     * @return DetectTypes <p>拓展的目标及事件检测类别<br>枚举值：</p><ul><li>person：人</li><li>vehicle：车辆</li><li>cat：猫</li><li>dog：狗</li><li>package：快递包裹</li><li>license_plate：车牌</li><li>fire：火焰</li><li>smoke：烟雾</li><li>delivery_man：快递员/外卖员</li><li>pet：有宠物</li><li>pet_scratching_door：宠物挠门</li><li>pet_barking：宠物吠叫</li><li>pet_damaging：宠物损坏家具</li><li>pet_eating：宠物进食</li><li>person_playing_with_pet：人与宠物玩耍</li><li>pet_close_to_camera：宠物靠近摄像头</li><li>animal_lying：有动物躺/趴在地上</li><li>child：有小孩</li><li>child_near_water：小孩靠近水域</li><li>child_falling：小孩摔倒</li><li>child_climbing_window：小孩攀爬室内窗户</li><li>child_entering_kitchen：小孩进入厨房</li><li>child_playing_danger_item：小孩玩危险物品</li><li>child_writing：小孩写作业</li><li>baby：有婴儿</li><li>baby_crying：婴儿哭闹</li><li>baby_dropping：婴儿跌落床铺</li><li>person_holding_baby：有人抱起婴儿</li><li>baby_rolling：婴儿翻滚</li><li>elderly：有老人</li><li>elderly_falling：老人摔倒</li><li>elderly_eating：老人用餐</li><li>elderly_using_stove：老人使用灶具</li><li>vehicle_parking：车辆停靠</li><li>vehicle_entering：车辆进入</li><li>vehicle_exiting：车辆离开</li><li>person_feeding_animal：有人投喂牲畜</li><li>animal_wild_intrusion：野生动物入侵</li><li>throwing_into_water：有人投掷物品</li><li>loitering_near_water：有人岸边逗留</li><li>fishing：有人钓鱼</li><li>net_fishing：有人撒网</li><li>person_carrying_fishing_gear：有人携带渔具</li><li>person_carrying_object：有人搬运物品</li><li>person_taking_goods：有人拿商品</li><li>person_night_moving：夜间有人移动</li><li>crowd：多人聚集</li><li>person_picking_fruit：有人采摘果实</li><li>person_at_cashier：有人在收银台</li><li>person_climbing_fence：有人翻围墙</li><li>person_carrying_bag：有人携带包裹</li><li>person_entering_farm：人员进入农场</li><li>person_entering_store：人员进入店铺</li><li>person_falling：有人跌倒</li><li>staff_absent：员工离岗</li><li>uniform_abnormal：未穿工服</li><li>using_mobile_phone：使用手机</li><li>smoking：有人吸烟</li><li>knife：有人持刀</li><li>gun：有人持枪</li><li>hurt：有人受伤流血</li><li>fight：有人打架</li><li>door_window_open：门窗被开启</li><li>fireworks：有人燃放烟花爆竹</li><li>no_signal：视频画面异常（无信号等）</li><li>camera_angle_abnormal：摄像头角度异常</li><li>person_motionless：有人且其姿势保持静止</li></ul>
     */
    public String [] getDetectTypes() {
        return this.DetectTypes;
    }

    /**
     * Set <p>拓展的目标及事件检测类别<br>枚举值：</p><ul><li>person：人</li><li>vehicle：车辆</li><li>cat：猫</li><li>dog：狗</li><li>package：快递包裹</li><li>license_plate：车牌</li><li>fire：火焰</li><li>smoke：烟雾</li><li>delivery_man：快递员/外卖员</li><li>pet：有宠物</li><li>pet_scratching_door：宠物挠门</li><li>pet_barking：宠物吠叫</li><li>pet_damaging：宠物损坏家具</li><li>pet_eating：宠物进食</li><li>person_playing_with_pet：人与宠物玩耍</li><li>pet_close_to_camera：宠物靠近摄像头</li><li>animal_lying：有动物躺/趴在地上</li><li>child：有小孩</li><li>child_near_water：小孩靠近水域</li><li>child_falling：小孩摔倒</li><li>child_climbing_window：小孩攀爬室内窗户</li><li>child_entering_kitchen：小孩进入厨房</li><li>child_playing_danger_item：小孩玩危险物品</li><li>child_writing：小孩写作业</li><li>baby：有婴儿</li><li>baby_crying：婴儿哭闹</li><li>baby_dropping：婴儿跌落床铺</li><li>person_holding_baby：有人抱起婴儿</li><li>baby_rolling：婴儿翻滚</li><li>elderly：有老人</li><li>elderly_falling：老人摔倒</li><li>elderly_eating：老人用餐</li><li>elderly_using_stove：老人使用灶具</li><li>vehicle_parking：车辆停靠</li><li>vehicle_entering：车辆进入</li><li>vehicle_exiting：车辆离开</li><li>person_feeding_animal：有人投喂牲畜</li><li>animal_wild_intrusion：野生动物入侵</li><li>throwing_into_water：有人投掷物品</li><li>loitering_near_water：有人岸边逗留</li><li>fishing：有人钓鱼</li><li>net_fishing：有人撒网</li><li>person_carrying_fishing_gear：有人携带渔具</li><li>person_carrying_object：有人搬运物品</li><li>person_taking_goods：有人拿商品</li><li>person_night_moving：夜间有人移动</li><li>crowd：多人聚集</li><li>person_picking_fruit：有人采摘果实</li><li>person_at_cashier：有人在收银台</li><li>person_climbing_fence：有人翻围墙</li><li>person_carrying_bag：有人携带包裹</li><li>person_entering_farm：人员进入农场</li><li>person_entering_store：人员进入店铺</li><li>person_falling：有人跌倒</li><li>staff_absent：员工离岗</li><li>uniform_abnormal：未穿工服</li><li>using_mobile_phone：使用手机</li><li>smoking：有人吸烟</li><li>knife：有人持刀</li><li>gun：有人持枪</li><li>hurt：有人受伤流血</li><li>fight：有人打架</li><li>door_window_open：门窗被开启</li><li>fireworks：有人燃放烟花爆竹</li><li>no_signal：视频画面异常（无信号等）</li><li>camera_angle_abnormal：摄像头角度异常</li><li>person_motionless：有人且其姿势保持静止</li></ul>
     * @param DetectTypes <p>拓展的目标及事件检测类别<br>枚举值：</p><ul><li>person：人</li><li>vehicle：车辆</li><li>cat：猫</li><li>dog：狗</li><li>package：快递包裹</li><li>license_plate：车牌</li><li>fire：火焰</li><li>smoke：烟雾</li><li>delivery_man：快递员/外卖员</li><li>pet：有宠物</li><li>pet_scratching_door：宠物挠门</li><li>pet_barking：宠物吠叫</li><li>pet_damaging：宠物损坏家具</li><li>pet_eating：宠物进食</li><li>person_playing_with_pet：人与宠物玩耍</li><li>pet_close_to_camera：宠物靠近摄像头</li><li>animal_lying：有动物躺/趴在地上</li><li>child：有小孩</li><li>child_near_water：小孩靠近水域</li><li>child_falling：小孩摔倒</li><li>child_climbing_window：小孩攀爬室内窗户</li><li>child_entering_kitchen：小孩进入厨房</li><li>child_playing_danger_item：小孩玩危险物品</li><li>child_writing：小孩写作业</li><li>baby：有婴儿</li><li>baby_crying：婴儿哭闹</li><li>baby_dropping：婴儿跌落床铺</li><li>person_holding_baby：有人抱起婴儿</li><li>baby_rolling：婴儿翻滚</li><li>elderly：有老人</li><li>elderly_falling：老人摔倒</li><li>elderly_eating：老人用餐</li><li>elderly_using_stove：老人使用灶具</li><li>vehicle_parking：车辆停靠</li><li>vehicle_entering：车辆进入</li><li>vehicle_exiting：车辆离开</li><li>person_feeding_animal：有人投喂牲畜</li><li>animal_wild_intrusion：野生动物入侵</li><li>throwing_into_water：有人投掷物品</li><li>loitering_near_water：有人岸边逗留</li><li>fishing：有人钓鱼</li><li>net_fishing：有人撒网</li><li>person_carrying_fishing_gear：有人携带渔具</li><li>person_carrying_object：有人搬运物品</li><li>person_taking_goods：有人拿商品</li><li>person_night_moving：夜间有人移动</li><li>crowd：多人聚集</li><li>person_picking_fruit：有人采摘果实</li><li>person_at_cashier：有人在收银台</li><li>person_climbing_fence：有人翻围墙</li><li>person_carrying_bag：有人携带包裹</li><li>person_entering_farm：人员进入农场</li><li>person_entering_store：人员进入店铺</li><li>person_falling：有人跌倒</li><li>staff_absent：员工离岗</li><li>uniform_abnormal：未穿工服</li><li>using_mobile_phone：使用手机</li><li>smoking：有人吸烟</li><li>knife：有人持刀</li><li>gun：有人持枪</li><li>hurt：有人受伤流血</li><li>fight：有人打架</li><li>door_window_open：门窗被开启</li><li>fireworks：有人燃放烟花爆竹</li><li>no_signal：视频画面异常（无信号等）</li><li>camera_angle_abnormal：摄像头角度异常</li><li>person_motionless：有人且其姿势保持静止</li></ul>
     */
    public void setDetectTypes(String [] DetectTypes) {
        this.DetectTypes = DetectTypes;
    }

    /**
     * Get <p>使该视频 / 图片录入搜索库，后续可进行搜索</p> 
     * @return EnableSearch <p>使该视频 / 图片录入搜索库，后续可进行搜索</p>
     */
    public Boolean getEnableSearch() {
        return this.EnableSearch;
    }

    /**
     * Set <p>使该视频 / 图片录入搜索库，后续可进行搜索</p>
     * @param EnableSearch <p>使该视频 / 图片录入搜索库，后续可进行搜索</p>
     */
    public void setEnableSearch(Boolean EnableSearch) {
        this.EnableSearch = EnableSearch;
    }

    /**
     * Get <p>主输出语言，可选值包括：</p><ul><li><code>zh</code> 中文（默认值）</li><li><code>en</code> 英语</li><li><code>ja</code> 日语</li><li><code>ko</code> 韩文</li><li><code>pt-BR</code> 葡萄牙语（巴西）</li><li><code>th</code> 泰语</li><li><code>ms</code> 马来语</li></ul> 
     * @return OutputLang <p>主输出语言，可选值包括：</p><ul><li><code>zh</code> 中文（默认值）</li><li><code>en</code> 英语</li><li><code>ja</code> 日语</li><li><code>ko</code> 韩文</li><li><code>pt-BR</code> 葡萄牙语（巴西）</li><li><code>th</code> 泰语</li><li><code>ms</code> 马来语</li></ul>
     */
    public String getOutputLang() {
        return this.OutputLang;
    }

    /**
     * Set <p>主输出语言，可选值包括：</p><ul><li><code>zh</code> 中文（默认值）</li><li><code>en</code> 英语</li><li><code>ja</code> 日语</li><li><code>ko</code> 韩文</li><li><code>pt-BR</code> 葡萄牙语（巴西）</li><li><code>th</code> 泰语</li><li><code>ms</code> 马来语</li></ul>
     * @param OutputLang <p>主输出语言，可选值包括：</p><ul><li><code>zh</code> 中文（默认值）</li><li><code>en</code> 英语</li><li><code>ja</code> 日语</li><li><code>ko</code> 韩文</li><li><code>pt-BR</code> 葡萄牙语（巴西）</li><li><code>th</code> 泰语</li><li><code>ms</code> 马来语</li></ul>
     */
    public void setOutputLang(String OutputLang) {
        this.OutputLang = OutputLang;
    }

    /**
     * Get <p>次选输出语言，可选值包括：</p><ul><li><code>zh</code> 中文</li><li><code>en</code> 英语</li><li><code>ja</code> 日语</li><li><code>ko</code> 韩文</li><li><code>pt-BR</code> 葡萄牙语（巴西）</li><li><code>th</code> 泰语</li><li><code>ms</code> 马来语</li></ul> 
     * @return AlternativeOutputLang <p>次选输出语言，可选值包括：</p><ul><li><code>zh</code> 中文</li><li><code>en</code> 英语</li><li><code>ja</code> 日语</li><li><code>ko</code> 韩文</li><li><code>pt-BR</code> 葡萄牙语（巴西）</li><li><code>th</code> 泰语</li><li><code>ms</code> 马来语</li></ul>
     */
    public String getAlternativeOutputLang() {
        return this.AlternativeOutputLang;
    }

    /**
     * Set <p>次选输出语言，可选值包括：</p><ul><li><code>zh</code> 中文</li><li><code>en</code> 英语</li><li><code>ja</code> 日语</li><li><code>ko</code> 韩文</li><li><code>pt-BR</code> 葡萄牙语（巴西）</li><li><code>th</code> 泰语</li><li><code>ms</code> 马来语</li></ul>
     * @param AlternativeOutputLang <p>次选输出语言，可选值包括：</p><ul><li><code>zh</code> 中文</li><li><code>en</code> 英语</li><li><code>ja</code> 日语</li><li><code>ko</code> 韩文</li><li><code>pt-BR</code> 葡萄牙语（巴西）</li><li><code>th</code> 泰语</li><li><code>ms</code> 马来语</li></ul>
     */
    public void setAlternativeOutputLang(String AlternativeOutputLang) {
        this.AlternativeOutputLang = AlternativeOutputLang;
    }

    /**
     * Get <p>多摄像头布局定义。可选值包括：</p><ul><li><p>单摄（默认值）：<code>Single</code></p></li><li><p>双摄（纵向排列）- 全部画面：<code>Vertical,Num=2,Index=0;1</code></p></li><li><p>双摄（纵向排列）- 画面1：<code>Vertical,Num=2,Index=0</code></p></li><li><p>双摄（纵向排列）- 画面2：<code>Vertical,Num=2,Index=1</code></p></li><li><p>三摄（纵向排列）- 全部画面：<code>Vertical,Num=3,Index=0;1;2</code></p></li><li><p>三摄（纵向排列）- 画面1：<code>Vertical,Num=3,Index=0</code></p></li><li><p>三摄（纵向排列）- 画面2：<code>Vertical,Num=3,Index=1</code></p></li><li><p>三摄（纵向排列）- 画面3：<code>Vertical,Num=3,Index=2</code></p></li><li><p>三摄（纵向排列）- 画面1+2：<code>Vertical,Num=3,Index=0;1</code></p></li><li><p>三摄（纵向排列）- 画面1+3：<code>Vertical,Num=3,Index=0;2</code></p></li><li><p>三摄（纵向排列）- 画面2+3：<code>Vertical,Num=3,Index=1;2</code></p></li></ul> 
     * @return MultiCameraLayout <p>多摄像头布局定义。可选值包括：</p><ul><li><p>单摄（默认值）：<code>Single</code></p></li><li><p>双摄（纵向排列）- 全部画面：<code>Vertical,Num=2,Index=0;1</code></p></li><li><p>双摄（纵向排列）- 画面1：<code>Vertical,Num=2,Index=0</code></p></li><li><p>双摄（纵向排列）- 画面2：<code>Vertical,Num=2,Index=1</code></p></li><li><p>三摄（纵向排列）- 全部画面：<code>Vertical,Num=3,Index=0;1;2</code></p></li><li><p>三摄（纵向排列）- 画面1：<code>Vertical,Num=3,Index=0</code></p></li><li><p>三摄（纵向排列）- 画面2：<code>Vertical,Num=3,Index=1</code></p></li><li><p>三摄（纵向排列）- 画面3：<code>Vertical,Num=3,Index=2</code></p></li><li><p>三摄（纵向排列）- 画面1+2：<code>Vertical,Num=3,Index=0;1</code></p></li><li><p>三摄（纵向排列）- 画面1+3：<code>Vertical,Num=3,Index=0;2</code></p></li><li><p>三摄（纵向排列）- 画面2+3：<code>Vertical,Num=3,Index=1;2</code></p></li></ul>
     */
    public String getMultiCameraLayout() {
        return this.MultiCameraLayout;
    }

    /**
     * Set <p>多摄像头布局定义。可选值包括：</p><ul><li><p>单摄（默认值）：<code>Single</code></p></li><li><p>双摄（纵向排列）- 全部画面：<code>Vertical,Num=2,Index=0;1</code></p></li><li><p>双摄（纵向排列）- 画面1：<code>Vertical,Num=2,Index=0</code></p></li><li><p>双摄（纵向排列）- 画面2：<code>Vertical,Num=2,Index=1</code></p></li><li><p>三摄（纵向排列）- 全部画面：<code>Vertical,Num=3,Index=0;1;2</code></p></li><li><p>三摄（纵向排列）- 画面1：<code>Vertical,Num=3,Index=0</code></p></li><li><p>三摄（纵向排列）- 画面2：<code>Vertical,Num=3,Index=1</code></p></li><li><p>三摄（纵向排列）- 画面3：<code>Vertical,Num=3,Index=2</code></p></li><li><p>三摄（纵向排列）- 画面1+2：<code>Vertical,Num=3,Index=0;1</code></p></li><li><p>三摄（纵向排列）- 画面1+3：<code>Vertical,Num=3,Index=0;2</code></p></li><li><p>三摄（纵向排列）- 画面2+3：<code>Vertical,Num=3,Index=1;2</code></p></li></ul>
     * @param MultiCameraLayout <p>多摄像头布局定义。可选值包括：</p><ul><li><p>单摄（默认值）：<code>Single</code></p></li><li><p>双摄（纵向排列）- 全部画面：<code>Vertical,Num=2,Index=0;1</code></p></li><li><p>双摄（纵向排列）- 画面1：<code>Vertical,Num=2,Index=0</code></p></li><li><p>双摄（纵向排列）- 画面2：<code>Vertical,Num=2,Index=1</code></p></li><li><p>三摄（纵向排列）- 全部画面：<code>Vertical,Num=3,Index=0;1;2</code></p></li><li><p>三摄（纵向排列）- 画面1：<code>Vertical,Num=3,Index=0</code></p></li><li><p>三摄（纵向排列）- 画面2：<code>Vertical,Num=3,Index=1</code></p></li><li><p>三摄（纵向排列）- 画面3：<code>Vertical,Num=3,Index=2</code></p></li><li><p>三摄（纵向排列）- 画面1+2：<code>Vertical,Num=3,Index=0;1</code></p></li><li><p>三摄（纵向排列）- 画面1+3：<code>Vertical,Num=3,Index=0;2</code></p></li><li><p>三摄（纵向排列）- 画面2+3：<code>Vertical,Num=3,Index=1;2</code></p></li></ul>
     */
    public void setMultiCameraLayout(String MultiCameraLayout) {
        this.MultiCameraLayout = MultiCameraLayout;
    }

    /**
     * Get <p>自定义检测标签</p> 
     * @return CustomDetectQueries <p>自定义检测标签</p>
     */
    public VisionCustomDetectQuery [] getCustomDetectQueries() {
        return this.CustomDetectQueries;
    }

    /**
     * Set <p>自定义检测标签</p>
     * @param CustomDetectQueries <p>自定义检测标签</p>
     */
    public void setCustomDetectQueries(VisionCustomDetectQuery [] CustomDetectQueries) {
        this.CustomDetectQueries = CustomDetectQueries;
    }

    /**
     * Get <p>最大处理的输入视频时长，单位：秒（仅对视频输入生效）</p> 
     * @return MaxDuration <p>最大处理的输入视频时长，单位：秒（仅对视频输入生效）</p>
     */
    public Long getMaxDuration() {
        return this.MaxDuration;
    }

    /**
     * Set <p>最大处理的输入视频时长，单位：秒（仅对视频输入生效）</p>
     * @param MaxDuration <p>最大处理的输入视频时长，单位：秒（仅对视频输入生效）</p>
     */
    public void setMaxDuration(Long MaxDuration) {
        this.MaxDuration = MaxDuration;
    }

    /**
     * Get <p>是否生成关键词</p><p>默认值：false</p> 
     * @return EnableKeywords <p>是否生成关键词</p><p>默认值：false</p>
     */
    public Boolean getEnableKeywords() {
        return this.EnableKeywords;
    }

    /**
     * Set <p>是否生成关键词</p><p>默认值：false</p>
     * @param EnableKeywords <p>是否生成关键词</p><p>默认值：false</p>
     */
    public void setEnableKeywords(Boolean EnableKeywords) {
        this.EnableKeywords = EnableKeywords;
    }

    public SeeComprehensionConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SeeComprehensionConfig(SeeComprehensionConfig source) {
        if (source.DetectTypes != null) {
            this.DetectTypes = new String[source.DetectTypes.length];
            for (int i = 0; i < source.DetectTypes.length; i++) {
                this.DetectTypes[i] = new String(source.DetectTypes[i]);
            }
        }
        if (source.EnableSearch != null) {
            this.EnableSearch = new Boolean(source.EnableSearch);
        }
        if (source.OutputLang != null) {
            this.OutputLang = new String(source.OutputLang);
        }
        if (source.AlternativeOutputLang != null) {
            this.AlternativeOutputLang = new String(source.AlternativeOutputLang);
        }
        if (source.MultiCameraLayout != null) {
            this.MultiCameraLayout = new String(source.MultiCameraLayout);
        }
        if (source.CustomDetectQueries != null) {
            this.CustomDetectQueries = new VisionCustomDetectQuery[source.CustomDetectQueries.length];
            for (int i = 0; i < source.CustomDetectQueries.length; i++) {
                this.CustomDetectQueries[i] = new VisionCustomDetectQuery(source.CustomDetectQueries[i]);
            }
        }
        if (source.MaxDuration != null) {
            this.MaxDuration = new Long(source.MaxDuration);
        }
        if (source.EnableKeywords != null) {
            this.EnableKeywords = new Boolean(source.EnableKeywords);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "DetectTypes.", this.DetectTypes);
        this.setParamSimple(map, prefix + "EnableSearch", this.EnableSearch);
        this.setParamSimple(map, prefix + "OutputLang", this.OutputLang);
        this.setParamSimple(map, prefix + "AlternativeOutputLang", this.AlternativeOutputLang);
        this.setParamSimple(map, prefix + "MultiCameraLayout", this.MultiCameraLayout);
        this.setParamArrayObj(map, prefix + "CustomDetectQueries.", this.CustomDetectQueries);
        this.setParamSimple(map, prefix + "MaxDuration", this.MaxDuration);
        this.setParamSimple(map, prefix + "EnableKeywords", this.EnableKeywords);

    }
}

