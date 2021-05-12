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
package com.tencentcloudapi.gse.v20191112.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QuotaResource extends AbstractModel{

    /**
    * 资源类型，1生成包、2服务部署、3别名、4游戏服务器队列、5实例
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceType")
    @Expose
    private Long ResourceType;

    /**
    * 总额度
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HardLimit")
    @Expose
    private Long HardLimit;

    /**
    * 剩余额度
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Remaining")
    @Expose
    private Long Remaining;

    /**
    * 额外信息，可能为空
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExtraInfo")
    @Expose
    private String ExtraInfo;

    /**
     * Get 资源类型，1生成包、2服务部署、3别名、4游戏服务器队列、5实例
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceType 资源类型，1生成包、2服务部署、3别名、4游戏服务器队列、5实例
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set 资源类型，1生成包、2服务部署、3别名、4游戏服务器队列、5实例
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceType 资源类型，1生成包、2服务部署、3别名、4游戏服务器队列、5实例
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceType(Long ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * Get 总额度
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HardLimit 总额度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getHardLimit() {
        return this.HardLimit;
    }

    /**
     * Set 总额度
注意：此字段可能返回 null，表示取不到有效值。
     * @param HardLimit 总额度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHardLimit(Long HardLimit) {
        this.HardLimit = HardLimit;
    }

    /**
     * Get 剩余额度
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Remaining 剩余额度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRemaining() {
        return this.Remaining;
    }

    /**
     * Set 剩余额度
注意：此字段可能返回 null，表示取不到有效值。
     * @param Remaining 剩余额度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRemaining(Long Remaining) {
        this.Remaining = Remaining;
    }

    /**
     * Get 额外信息，可能为空
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExtraInfo 额外信息，可能为空
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExtraInfo() {
        return this.ExtraInfo;
    }

    /**
     * Set 额外信息，可能为空
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExtraInfo 额外信息，可能为空
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExtraInfo(String ExtraInfo) {
        this.ExtraInfo = ExtraInfo;
    }

    public QuotaResource() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QuotaResource(QuotaResource source) {
        if (source.ResourceType != null) {
            this.ResourceType = new Long(source.ResourceType);
        }
        if (source.HardLimit != null) {
            this.HardLimit = new Long(source.HardLimit);
        }
        if (source.Remaining != null) {
            this.Remaining = new Long(source.Remaining);
        }
        if (source.ExtraInfo != null) {
            this.ExtraInfo = new String(source.ExtraInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);
        this.setParamSimple(map, prefix + "HardLimit", this.HardLimit);
        this.setParamSimple(map, prefix + "Remaining", this.Remaining);
        this.setParamSimple(map, prefix + "ExtraInfo", this.ExtraInfo);

    }
}

