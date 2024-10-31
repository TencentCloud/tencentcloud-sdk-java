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
package com.tencentcloudapi.privatedns.v20201028.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EndPointInfo extends AbstractModel {

    /**
    * 终端节点ID
    */
    @SerializedName("EndPointId")
    @Expose
    private String EndPointId;

    /**
    * 终端节点名称
    */
    @SerializedName("EndPointName")
    @Expose
    private String EndPointName;

    /**
    * 终端节点服务ID
    */
    @SerializedName("EndPointServiceId")
    @Expose
    private String EndPointServiceId;

    /**
    * 终端节点VIP列表
    */
    @SerializedName("EndPointVipSet")
    @Expose
    private String [] EndPointVipSet;

    /**
    * ap-guangzhou
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RegionCode")
    @Expose
    private String RegionCode;

    /**
    * 标签键值对集合
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tags")
    @Expose
    private TagInfo [] Tags;

    /**
     * Get 终端节点ID 
     * @return EndPointId 终端节点ID
     */
    public String getEndPointId() {
        return this.EndPointId;
    }

    /**
     * Set 终端节点ID
     * @param EndPointId 终端节点ID
     */
    public void setEndPointId(String EndPointId) {
        this.EndPointId = EndPointId;
    }

    /**
     * Get 终端节点名称 
     * @return EndPointName 终端节点名称
     */
    public String getEndPointName() {
        return this.EndPointName;
    }

    /**
     * Set 终端节点名称
     * @param EndPointName 终端节点名称
     */
    public void setEndPointName(String EndPointName) {
        this.EndPointName = EndPointName;
    }

    /**
     * Get 终端节点服务ID 
     * @return EndPointServiceId 终端节点服务ID
     */
    public String getEndPointServiceId() {
        return this.EndPointServiceId;
    }

    /**
     * Set 终端节点服务ID
     * @param EndPointServiceId 终端节点服务ID
     */
    public void setEndPointServiceId(String EndPointServiceId) {
        this.EndPointServiceId = EndPointServiceId;
    }

    /**
     * Get 终端节点VIP列表 
     * @return EndPointVipSet 终端节点VIP列表
     */
    public String [] getEndPointVipSet() {
        return this.EndPointVipSet;
    }

    /**
     * Set 终端节点VIP列表
     * @param EndPointVipSet 终端节点VIP列表
     */
    public void setEndPointVipSet(String [] EndPointVipSet) {
        this.EndPointVipSet = EndPointVipSet;
    }

    /**
     * Get ap-guangzhou
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RegionCode ap-guangzhou
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRegionCode() {
        return this.RegionCode;
    }

    /**
     * Set ap-guangzhou
注意：此字段可能返回 null，表示取不到有效值。
     * @param RegionCode ap-guangzhou
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegionCode(String RegionCode) {
        this.RegionCode = RegionCode;
    }

    /**
     * Get 标签键值对集合
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tags 标签键值对集合
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TagInfo [] getTags() {
        return this.Tags;
    }

    /**
     * Set 标签键值对集合
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tags 标签键值对集合
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTags(TagInfo [] Tags) {
        this.Tags = Tags;
    }

    public EndPointInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EndPointInfo(EndPointInfo source) {
        if (source.EndPointId != null) {
            this.EndPointId = new String(source.EndPointId);
        }
        if (source.EndPointName != null) {
            this.EndPointName = new String(source.EndPointName);
        }
        if (source.EndPointServiceId != null) {
            this.EndPointServiceId = new String(source.EndPointServiceId);
        }
        if (source.EndPointVipSet != null) {
            this.EndPointVipSet = new String[source.EndPointVipSet.length];
            for (int i = 0; i < source.EndPointVipSet.length; i++) {
                this.EndPointVipSet[i] = new String(source.EndPointVipSet[i]);
            }
        }
        if (source.RegionCode != null) {
            this.RegionCode = new String(source.RegionCode);
        }
        if (source.Tags != null) {
            this.Tags = new TagInfo[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new TagInfo(source.Tags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EndPointId", this.EndPointId);
        this.setParamSimple(map, prefix + "EndPointName", this.EndPointName);
        this.setParamSimple(map, prefix + "EndPointServiceId", this.EndPointServiceId);
        this.setParamArraySimple(map, prefix + "EndPointVipSet.", this.EndPointVipSet);
        this.setParamSimple(map, prefix + "RegionCode", this.RegionCode);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

