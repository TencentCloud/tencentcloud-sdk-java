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
package com.tencentcloudapi.iss.v20230517.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateVideoSnapshotTemplateRequest extends AbstractModel {

    /**
    * <p>模板名称： 中文、英文、数字、“-”、“_” 长度不超过128个字符</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>截图类型： 1-实时截帧 2-低频截帧<br>注意：实时截帧在生效时段期间一直拉取实时流， 低频截帧在生效时段期间按需拉取实时流，每次拉流的最短持续时间不低于1分钟</p><p>枚举值：</p><ul><li>1： 实时截帧</li><li>2： 低频截帧</li></ul>
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * <p>截帧频率： Type = 1时，取值[5, 180]秒 Type = 2时 取值[30, 36000]秒</p>
    */
    @SerializedName("Interval")
    @Expose
    private Long Interval;

    /**
    * <p>生效时段，注：数组大小不超过100个且每个时间段不低于1分钟</p>
    */
    @SerializedName("Times")
    @Expose
    private EffectiveTime [] Times;

    /**
    * <p>多张模式</p>
    */
    @SerializedName("MultiMode")
    @Expose
    private MultiVideoSnapshotMode MultiMode;

    /**
     * Get <p>模板名称： 中文、英文、数字、“-”、“_” 长度不超过128个字符</p> 
     * @return Name <p>模板名称： 中文、英文、数字、“-”、“_” 长度不超过128个字符</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>模板名称： 中文、英文、数字、“-”、“_” 长度不超过128个字符</p>
     * @param Name <p>模板名称： 中文、英文、数字、“-”、“_” 长度不超过128个字符</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>截图类型： 1-实时截帧 2-低频截帧<br>注意：实时截帧在生效时段期间一直拉取实时流， 低频截帧在生效时段期间按需拉取实时流，每次拉流的最短持续时间不低于1分钟</p><p>枚举值：</p><ul><li>1： 实时截帧</li><li>2： 低频截帧</li></ul> 
     * @return Type <p>截图类型： 1-实时截帧 2-低频截帧<br>注意：实时截帧在生效时段期间一直拉取实时流， 低频截帧在生效时段期间按需拉取实时流，每次拉流的最短持续时间不低于1分钟</p><p>枚举值：</p><ul><li>1： 实时截帧</li><li>2： 低频截帧</li></ul>
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set <p>截图类型： 1-实时截帧 2-低频截帧<br>注意：实时截帧在生效时段期间一直拉取实时流， 低频截帧在生效时段期间按需拉取实时流，每次拉流的最短持续时间不低于1分钟</p><p>枚举值：</p><ul><li>1： 实时截帧</li><li>2： 低频截帧</li></ul>
     * @param Type <p>截图类型： 1-实时截帧 2-低频截帧<br>注意：实时截帧在生效时段期间一直拉取实时流， 低频截帧在生效时段期间按需拉取实时流，每次拉流的最短持续时间不低于1分钟</p><p>枚举值：</p><ul><li>1： 实时截帧</li><li>2： 低频截帧</li></ul>
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get <p>截帧频率： Type = 1时，取值[5, 180]秒 Type = 2时 取值[30, 36000]秒</p> 
     * @return Interval <p>截帧频率： Type = 1时，取值[5, 180]秒 Type = 2时 取值[30, 36000]秒</p>
     */
    public Long getInterval() {
        return this.Interval;
    }

    /**
     * Set <p>截帧频率： Type = 1时，取值[5, 180]秒 Type = 2时 取值[30, 36000]秒</p>
     * @param Interval <p>截帧频率： Type = 1时，取值[5, 180]秒 Type = 2时 取值[30, 36000]秒</p>
     */
    public void setInterval(Long Interval) {
        this.Interval = Interval;
    }

    /**
     * Get <p>生效时段，注：数组大小不超过100个且每个时间段不低于1分钟</p> 
     * @return Times <p>生效时段，注：数组大小不超过100个且每个时间段不低于1分钟</p>
     */
    public EffectiveTime [] getTimes() {
        return this.Times;
    }

    /**
     * Set <p>生效时段，注：数组大小不超过100个且每个时间段不低于1分钟</p>
     * @param Times <p>生效时段，注：数组大小不超过100个且每个时间段不低于1分钟</p>
     */
    public void setTimes(EffectiveTime [] Times) {
        this.Times = Times;
    }

    /**
     * Get <p>多张模式</p> 
     * @return MultiMode <p>多张模式</p>
     */
    public MultiVideoSnapshotMode getMultiMode() {
        return this.MultiMode;
    }

    /**
     * Set <p>多张模式</p>
     * @param MultiMode <p>多张模式</p>
     */
    public void setMultiMode(MultiVideoSnapshotMode MultiMode) {
        this.MultiMode = MultiMode;
    }

    public CreateVideoSnapshotTemplateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateVideoSnapshotTemplateRequest(CreateVideoSnapshotTemplateRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.Interval != null) {
            this.Interval = new Long(source.Interval);
        }
        if (source.Times != null) {
            this.Times = new EffectiveTime[source.Times.length];
            for (int i = 0; i < source.Times.length; i++) {
                this.Times[i] = new EffectiveTime(source.Times[i]);
            }
        }
        if (source.MultiMode != null) {
            this.MultiMode = new MultiVideoSnapshotMode(source.MultiMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Interval", this.Interval);
        this.setParamArrayObj(map, prefix + "Times.", this.Times);
        this.setParamObj(map, prefix + "MultiMode.", this.MultiMode);

    }
}

