/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TopicRetentionTimeConfigRsp extends AbstractModel{

    /**
    * 期望值，即用户配置的Topic消息保留时间(单位分钟)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Expect")
    @Expose
    private Long Expect;

    /**
    * 当前值，即当前生效值(可能存在动态调整，单位分钟)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Current")
    @Expose
    private Long Current;

    /**
    * 最近变更时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModTimeStamp")
    @Expose
    private Long ModTimeStamp;

    /**
     * Get 期望值，即用户配置的Topic消息保留时间(单位分钟)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Expect 期望值，即用户配置的Topic消息保留时间(单位分钟)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getExpect() {
        return this.Expect;
    }

    /**
     * Set 期望值，即用户配置的Topic消息保留时间(单位分钟)
注意：此字段可能返回 null，表示取不到有效值。
     * @param Expect 期望值，即用户配置的Topic消息保留时间(单位分钟)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExpect(Long Expect) {
        this.Expect = Expect;
    }

    /**
     * Get 当前值，即当前生效值(可能存在动态调整，单位分钟)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Current 当前值，即当前生效值(可能存在动态调整，单位分钟)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCurrent() {
        return this.Current;
    }

    /**
     * Set 当前值，即当前生效值(可能存在动态调整，单位分钟)
注意：此字段可能返回 null，表示取不到有效值。
     * @param Current 当前值，即当前生效值(可能存在动态调整，单位分钟)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCurrent(Long Current) {
        this.Current = Current;
    }

    /**
     * Get 最近变更时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ModTimeStamp 最近变更时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getModTimeStamp() {
        return this.ModTimeStamp;
    }

    /**
     * Set 最近变更时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param ModTimeStamp 最近变更时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModTimeStamp(Long ModTimeStamp) {
        this.ModTimeStamp = ModTimeStamp;
    }

    public TopicRetentionTimeConfigRsp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TopicRetentionTimeConfigRsp(TopicRetentionTimeConfigRsp source) {
        if (source.Expect != null) {
            this.Expect = new Long(source.Expect);
        }
        if (source.Current != null) {
            this.Current = new Long(source.Current);
        }
        if (source.ModTimeStamp != null) {
            this.ModTimeStamp = new Long(source.ModTimeStamp);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Expect", this.Expect);
        this.setParamSimple(map, prefix + "Current", this.Current);
        this.setParamSimple(map, prefix + "ModTimeStamp", this.ModTimeStamp);

    }
}

