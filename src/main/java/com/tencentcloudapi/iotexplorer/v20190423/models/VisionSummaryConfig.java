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
    * <p>拓展的目标及事件检测类别。可选值包括：</p><p><strong>通用事件标签</strong></p><ul><li><code>person_enter</code> 有人进入</li><li><code>vehicle_entering</code> 车辆进入</li><li><code>vehicle_parking</code> 车辆停靠</li><li><code>pet</code> 有宠物</li><li><code>no_signal</code> 视频画面异常（无信号等）</li></ul><p><strong>看家护院</strong></p><ul><li><code>person_climbing_fence</code> 有人翻围墙</li><li><code>door_window_open</code> 门窗被开启</li><li><code>person_carrying_object</code> 有人搬运物品</li></ul><p><strong>商铺看管</strong></p><ul><li><code>person_at_cashier</code> 有人在收银台</li><li><code>person_taking_goods</code> 有人拿商品</li><li><code>person_night_moving</code> 夜间有人移动</li></ul><p><strong>公共及防火安全</strong></p><ul><li><code>person_stealing</code> 有人偷盗</li><li><code>crowd</code> 多人聚集</li><li><code>smoking</code> 有人吸烟</li><li><code>safety_fire</code> 明火</li><li><code>safety_smoke</code> 浓烟</li><li><code>fireworks</code> 有人燃放烟花爆竹</li><li><code>knife</code> 有人持刀</li><li><code>gun</code> 有人持枪</li><li><code>fight</code> 有人打架</li><li><code>hurt</code> 有人受伤流血</li></ul><p><strong>养殖看护</strong></p><ul><li><code>person_feeding_animal</code> 有人投喂牲畜</li><li><code>animal_lying</code> 有动物躺地上</li><li><code>animal_wild_intrusion</code> 野生动物入侵</li></ul><p><strong>果园农田</strong></p><ul><li><code>person_picking_fruit</code> 有人采摘果实</li><li><code>person_carrying_bag</code> 有人携带包裹</li></ul><p><strong>鱼塘看管</strong></p><ul><li><code>fishing</code> 有人钓鱼</li><li><code>net_fishing</code> 有人撒网</li><li><code>person_carrying_fishing_gear</code> 有人携带渔具</li><li><code>loitering_near_water</code> 有人岸边逗留</li><li><code>throwing_into_water</code> 有人投掷物品</li></ul><p><strong>婴儿看护</strong></p><ul><li><code>baby</code> 有婴儿</li><li><code>baby_dropping</code> 婴儿跌落床铺</li><li><code>person_holding_baby</code> 有人抱起婴儿</li><li><code>baby_rolling</code> 婴儿翻滚</li><li><code>baby_crying</code> 婴儿哭闹</li></ul><p><strong>儿童看护</strong></p><ul><li><code>child</code> 有小孩</li><li><code>child_falling</code> 小孩摔倒</li><li><code>child_entering_kitchen</code> 小孩进入厨房</li><li><code>child_climbing_window</code> 小孩攀爬室内窗户</li><li><code>child_near_water</code> 小孩靠近水域</li></ul><p><strong>老人看护</strong></p><ul><li><code>elderly</code> 有老人</li><li><code>elderly_falling</code> 老人摔倒</li><li><code>elderly_eating</code> 老人用餐</li><li><code>elderly_using_stove</code> 老人使用灶具</li></ul><p><strong>宠物看护</strong></p><ul><li><code>pet_eating</code> 宠物进食</li><li><code>pet_damaging</code> 宠物损坏家具</li><li><code>pet_barking</code> 宠物吠叫</li><li><code>pet_scratching_door</code> 宠物挠门</li></ul>
    */
    @SerializedName("DetectTypes")
    @Expose
    private String [] DetectTypes;

    /**
    * <p>自定义检测标签</p>
    */
    @SerializedName("CustomDetectQueries")
    @Expose
    private VisionCustomDetectQuery [] CustomDetectQueries;

    /**
    * <p>标签持续检测配置</p>
    */
    @SerializedName("DetectContinuous")
    @Expose
    private SeeDetectContinuousConfig [] DetectContinuous;

    /**
    * <p>自定义摘要提示词</p>
    */
    @SerializedName("SummaryPrompt")
    @Expose
    private String SummaryPrompt;

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
     * Get <p>拓展的目标及事件检测类别。可选值包括：</p><p><strong>通用事件标签</strong></p><ul><li><code>person_enter</code> 有人进入</li><li><code>vehicle_entering</code> 车辆进入</li><li><code>vehicle_parking</code> 车辆停靠</li><li><code>pet</code> 有宠物</li><li><code>no_signal</code> 视频画面异常（无信号等）</li></ul><p><strong>看家护院</strong></p><ul><li><code>person_climbing_fence</code> 有人翻围墙</li><li><code>door_window_open</code> 门窗被开启</li><li><code>person_carrying_object</code> 有人搬运物品</li></ul><p><strong>商铺看管</strong></p><ul><li><code>person_at_cashier</code> 有人在收银台</li><li><code>person_taking_goods</code> 有人拿商品</li><li><code>person_night_moving</code> 夜间有人移动</li></ul><p><strong>公共及防火安全</strong></p><ul><li><code>person_stealing</code> 有人偷盗</li><li><code>crowd</code> 多人聚集</li><li><code>smoking</code> 有人吸烟</li><li><code>safety_fire</code> 明火</li><li><code>safety_smoke</code> 浓烟</li><li><code>fireworks</code> 有人燃放烟花爆竹</li><li><code>knife</code> 有人持刀</li><li><code>gun</code> 有人持枪</li><li><code>fight</code> 有人打架</li><li><code>hurt</code> 有人受伤流血</li></ul><p><strong>养殖看护</strong></p><ul><li><code>person_feeding_animal</code> 有人投喂牲畜</li><li><code>animal_lying</code> 有动物躺地上</li><li><code>animal_wild_intrusion</code> 野生动物入侵</li></ul><p><strong>果园农田</strong></p><ul><li><code>person_picking_fruit</code> 有人采摘果实</li><li><code>person_carrying_bag</code> 有人携带包裹</li></ul><p><strong>鱼塘看管</strong></p><ul><li><code>fishing</code> 有人钓鱼</li><li><code>net_fishing</code> 有人撒网</li><li><code>person_carrying_fishing_gear</code> 有人携带渔具</li><li><code>loitering_near_water</code> 有人岸边逗留</li><li><code>throwing_into_water</code> 有人投掷物品</li></ul><p><strong>婴儿看护</strong></p><ul><li><code>baby</code> 有婴儿</li><li><code>baby_dropping</code> 婴儿跌落床铺</li><li><code>person_holding_baby</code> 有人抱起婴儿</li><li><code>baby_rolling</code> 婴儿翻滚</li><li><code>baby_crying</code> 婴儿哭闹</li></ul><p><strong>儿童看护</strong></p><ul><li><code>child</code> 有小孩</li><li><code>child_falling</code> 小孩摔倒</li><li><code>child_entering_kitchen</code> 小孩进入厨房</li><li><code>child_climbing_window</code> 小孩攀爬室内窗户</li><li><code>child_near_water</code> 小孩靠近水域</li></ul><p><strong>老人看护</strong></p><ul><li><code>elderly</code> 有老人</li><li><code>elderly_falling</code> 老人摔倒</li><li><code>elderly_eating</code> 老人用餐</li><li><code>elderly_using_stove</code> 老人使用灶具</li></ul><p><strong>宠物看护</strong></p><ul><li><code>pet_eating</code> 宠物进食</li><li><code>pet_damaging</code> 宠物损坏家具</li><li><code>pet_barking</code> 宠物吠叫</li><li><code>pet_scratching_door</code> 宠物挠门</li></ul> 
     * @return DetectTypes <p>拓展的目标及事件检测类别。可选值包括：</p><p><strong>通用事件标签</strong></p><ul><li><code>person_enter</code> 有人进入</li><li><code>vehicle_entering</code> 车辆进入</li><li><code>vehicle_parking</code> 车辆停靠</li><li><code>pet</code> 有宠物</li><li><code>no_signal</code> 视频画面异常（无信号等）</li></ul><p><strong>看家护院</strong></p><ul><li><code>person_climbing_fence</code> 有人翻围墙</li><li><code>door_window_open</code> 门窗被开启</li><li><code>person_carrying_object</code> 有人搬运物品</li></ul><p><strong>商铺看管</strong></p><ul><li><code>person_at_cashier</code> 有人在收银台</li><li><code>person_taking_goods</code> 有人拿商品</li><li><code>person_night_moving</code> 夜间有人移动</li></ul><p><strong>公共及防火安全</strong></p><ul><li><code>person_stealing</code> 有人偷盗</li><li><code>crowd</code> 多人聚集</li><li><code>smoking</code> 有人吸烟</li><li><code>safety_fire</code> 明火</li><li><code>safety_smoke</code> 浓烟</li><li><code>fireworks</code> 有人燃放烟花爆竹</li><li><code>knife</code> 有人持刀</li><li><code>gun</code> 有人持枪</li><li><code>fight</code> 有人打架</li><li><code>hurt</code> 有人受伤流血</li></ul><p><strong>养殖看护</strong></p><ul><li><code>person_feeding_animal</code> 有人投喂牲畜</li><li><code>animal_lying</code> 有动物躺地上</li><li><code>animal_wild_intrusion</code> 野生动物入侵</li></ul><p><strong>果园农田</strong></p><ul><li><code>person_picking_fruit</code> 有人采摘果实</li><li><code>person_carrying_bag</code> 有人携带包裹</li></ul><p><strong>鱼塘看管</strong></p><ul><li><code>fishing</code> 有人钓鱼</li><li><code>net_fishing</code> 有人撒网</li><li><code>person_carrying_fishing_gear</code> 有人携带渔具</li><li><code>loitering_near_water</code> 有人岸边逗留</li><li><code>throwing_into_water</code> 有人投掷物品</li></ul><p><strong>婴儿看护</strong></p><ul><li><code>baby</code> 有婴儿</li><li><code>baby_dropping</code> 婴儿跌落床铺</li><li><code>person_holding_baby</code> 有人抱起婴儿</li><li><code>baby_rolling</code> 婴儿翻滚</li><li><code>baby_crying</code> 婴儿哭闹</li></ul><p><strong>儿童看护</strong></p><ul><li><code>child</code> 有小孩</li><li><code>child_falling</code> 小孩摔倒</li><li><code>child_entering_kitchen</code> 小孩进入厨房</li><li><code>child_climbing_window</code> 小孩攀爬室内窗户</li><li><code>child_near_water</code> 小孩靠近水域</li></ul><p><strong>老人看护</strong></p><ul><li><code>elderly</code> 有老人</li><li><code>elderly_falling</code> 老人摔倒</li><li><code>elderly_eating</code> 老人用餐</li><li><code>elderly_using_stove</code> 老人使用灶具</li></ul><p><strong>宠物看护</strong></p><ul><li><code>pet_eating</code> 宠物进食</li><li><code>pet_damaging</code> 宠物损坏家具</li><li><code>pet_barking</code> 宠物吠叫</li><li><code>pet_scratching_door</code> 宠物挠门</li></ul>
     */
    public String [] getDetectTypes() {
        return this.DetectTypes;
    }

    /**
     * Set <p>拓展的目标及事件检测类别。可选值包括：</p><p><strong>通用事件标签</strong></p><ul><li><code>person_enter</code> 有人进入</li><li><code>vehicle_entering</code> 车辆进入</li><li><code>vehicle_parking</code> 车辆停靠</li><li><code>pet</code> 有宠物</li><li><code>no_signal</code> 视频画面异常（无信号等）</li></ul><p><strong>看家护院</strong></p><ul><li><code>person_climbing_fence</code> 有人翻围墙</li><li><code>door_window_open</code> 门窗被开启</li><li><code>person_carrying_object</code> 有人搬运物品</li></ul><p><strong>商铺看管</strong></p><ul><li><code>person_at_cashier</code> 有人在收银台</li><li><code>person_taking_goods</code> 有人拿商品</li><li><code>person_night_moving</code> 夜间有人移动</li></ul><p><strong>公共及防火安全</strong></p><ul><li><code>person_stealing</code> 有人偷盗</li><li><code>crowd</code> 多人聚集</li><li><code>smoking</code> 有人吸烟</li><li><code>safety_fire</code> 明火</li><li><code>safety_smoke</code> 浓烟</li><li><code>fireworks</code> 有人燃放烟花爆竹</li><li><code>knife</code> 有人持刀</li><li><code>gun</code> 有人持枪</li><li><code>fight</code> 有人打架</li><li><code>hurt</code> 有人受伤流血</li></ul><p><strong>养殖看护</strong></p><ul><li><code>person_feeding_animal</code> 有人投喂牲畜</li><li><code>animal_lying</code> 有动物躺地上</li><li><code>animal_wild_intrusion</code> 野生动物入侵</li></ul><p><strong>果园农田</strong></p><ul><li><code>person_picking_fruit</code> 有人采摘果实</li><li><code>person_carrying_bag</code> 有人携带包裹</li></ul><p><strong>鱼塘看管</strong></p><ul><li><code>fishing</code> 有人钓鱼</li><li><code>net_fishing</code> 有人撒网</li><li><code>person_carrying_fishing_gear</code> 有人携带渔具</li><li><code>loitering_near_water</code> 有人岸边逗留</li><li><code>throwing_into_water</code> 有人投掷物品</li></ul><p><strong>婴儿看护</strong></p><ul><li><code>baby</code> 有婴儿</li><li><code>baby_dropping</code> 婴儿跌落床铺</li><li><code>person_holding_baby</code> 有人抱起婴儿</li><li><code>baby_rolling</code> 婴儿翻滚</li><li><code>baby_crying</code> 婴儿哭闹</li></ul><p><strong>儿童看护</strong></p><ul><li><code>child</code> 有小孩</li><li><code>child_falling</code> 小孩摔倒</li><li><code>child_entering_kitchen</code> 小孩进入厨房</li><li><code>child_climbing_window</code> 小孩攀爬室内窗户</li><li><code>child_near_water</code> 小孩靠近水域</li></ul><p><strong>老人看护</strong></p><ul><li><code>elderly</code> 有老人</li><li><code>elderly_falling</code> 老人摔倒</li><li><code>elderly_eating</code> 老人用餐</li><li><code>elderly_using_stove</code> 老人使用灶具</li></ul><p><strong>宠物看护</strong></p><ul><li><code>pet_eating</code> 宠物进食</li><li><code>pet_damaging</code> 宠物损坏家具</li><li><code>pet_barking</code> 宠物吠叫</li><li><code>pet_scratching_door</code> 宠物挠门</li></ul>
     * @param DetectTypes <p>拓展的目标及事件检测类别。可选值包括：</p><p><strong>通用事件标签</strong></p><ul><li><code>person_enter</code> 有人进入</li><li><code>vehicle_entering</code> 车辆进入</li><li><code>vehicle_parking</code> 车辆停靠</li><li><code>pet</code> 有宠物</li><li><code>no_signal</code> 视频画面异常（无信号等）</li></ul><p><strong>看家护院</strong></p><ul><li><code>person_climbing_fence</code> 有人翻围墙</li><li><code>door_window_open</code> 门窗被开启</li><li><code>person_carrying_object</code> 有人搬运物品</li></ul><p><strong>商铺看管</strong></p><ul><li><code>person_at_cashier</code> 有人在收银台</li><li><code>person_taking_goods</code> 有人拿商品</li><li><code>person_night_moving</code> 夜间有人移动</li></ul><p><strong>公共及防火安全</strong></p><ul><li><code>person_stealing</code> 有人偷盗</li><li><code>crowd</code> 多人聚集</li><li><code>smoking</code> 有人吸烟</li><li><code>safety_fire</code> 明火</li><li><code>safety_smoke</code> 浓烟</li><li><code>fireworks</code> 有人燃放烟花爆竹</li><li><code>knife</code> 有人持刀</li><li><code>gun</code> 有人持枪</li><li><code>fight</code> 有人打架</li><li><code>hurt</code> 有人受伤流血</li></ul><p><strong>养殖看护</strong></p><ul><li><code>person_feeding_animal</code> 有人投喂牲畜</li><li><code>animal_lying</code> 有动物躺地上</li><li><code>animal_wild_intrusion</code> 野生动物入侵</li></ul><p><strong>果园农田</strong></p><ul><li><code>person_picking_fruit</code> 有人采摘果实</li><li><code>person_carrying_bag</code> 有人携带包裹</li></ul><p><strong>鱼塘看管</strong></p><ul><li><code>fishing</code> 有人钓鱼</li><li><code>net_fishing</code> 有人撒网</li><li><code>person_carrying_fishing_gear</code> 有人携带渔具</li><li><code>loitering_near_water</code> 有人岸边逗留</li><li><code>throwing_into_water</code> 有人投掷物品</li></ul><p><strong>婴儿看护</strong></p><ul><li><code>baby</code> 有婴儿</li><li><code>baby_dropping</code> 婴儿跌落床铺</li><li><code>person_holding_baby</code> 有人抱起婴儿</li><li><code>baby_rolling</code> 婴儿翻滚</li><li><code>baby_crying</code> 婴儿哭闹</li></ul><p><strong>儿童看护</strong></p><ul><li><code>child</code> 有小孩</li><li><code>child_falling</code> 小孩摔倒</li><li><code>child_entering_kitchen</code> 小孩进入厨房</li><li><code>child_climbing_window</code> 小孩攀爬室内窗户</li><li><code>child_near_water</code> 小孩靠近水域</li></ul><p><strong>老人看护</strong></p><ul><li><code>elderly</code> 有老人</li><li><code>elderly_falling</code> 老人摔倒</li><li><code>elderly_eating</code> 老人用餐</li><li><code>elderly_using_stove</code> 老人使用灶具</li></ul><p><strong>宠物看护</strong></p><ul><li><code>pet_eating</code> 宠物进食</li><li><code>pet_damaging</code> 宠物损坏家具</li><li><code>pet_barking</code> 宠物吠叫</li><li><code>pet_scratching_door</code> 宠物挠门</li></ul>
     */
    public void setDetectTypes(String [] DetectTypes) {
        this.DetectTypes = DetectTypes;
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
     * Get <p>标签持续检测配置</p> 
     * @return DetectContinuous <p>标签持续检测配置</p>
     */
    public SeeDetectContinuousConfig [] getDetectContinuous() {
        return this.DetectContinuous;
    }

    /**
     * Set <p>标签持续检测配置</p>
     * @param DetectContinuous <p>标签持续检测配置</p>
     */
    public void setDetectContinuous(SeeDetectContinuousConfig [] DetectContinuous) {
        this.DetectContinuous = DetectContinuous;
    }

    /**
     * Get <p>自定义摘要提示词</p> 
     * @return SummaryPrompt <p>自定义摘要提示词</p>
     */
    public String getSummaryPrompt() {
        return this.SummaryPrompt;
    }

    /**
     * Set <p>自定义摘要提示词</p>
     * @param SummaryPrompt <p>自定义摘要提示词</p>
     */
    public void setSummaryPrompt(String SummaryPrompt) {
        this.SummaryPrompt = SummaryPrompt;
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
        if (source.DetectContinuous != null) {
            this.DetectContinuous = new SeeDetectContinuousConfig[source.DetectContinuous.length];
            for (int i = 0; i < source.DetectContinuous.length; i++) {
                this.DetectContinuous[i] = new SeeDetectContinuousConfig(source.DetectContinuous[i]);
            }
        }
        if (source.SummaryPrompt != null) {
            this.SummaryPrompt = new String(source.SummaryPrompt);
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
        this.setParamArrayObj(map, prefix + "DetectContinuous.", this.DetectContinuous);
        this.setParamSimple(map, prefix + "SummaryPrompt", this.SummaryPrompt);

    }
}

