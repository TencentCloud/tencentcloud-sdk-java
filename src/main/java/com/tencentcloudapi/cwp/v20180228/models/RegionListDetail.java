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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RegionListDetail extends AbstractModel {

    /**
    * 机器类型
CVM 腾讯云云服务器
LH 腾讯云轻量服务器
ECM 腾讯云边缘计算服务器
BM 腾讯云黑石1.0 服务器
Other  其他服务器(非腾讯云)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MachineType")
    @Expose
    private String MachineType;

    /**
    * 0 腾讯云
1 IDC机房
2 阿里云
3 华为云
4 亚马逊
5 微软
6 Google
7 Oracle
8 Digital Ocean
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CloudFrom")
    @Expose
    private Long CloudFrom;

    /**
    * 地域列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RegionList")
    @Expose
    private RegionInfo [] RegionList;

    /**
     * Get 机器类型
CVM 腾讯云云服务器
LH 腾讯云轻量服务器
ECM 腾讯云边缘计算服务器
BM 腾讯云黑石1.0 服务器
Other  其他服务器(非腾讯云)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MachineType 机器类型
CVM 腾讯云云服务器
LH 腾讯云轻量服务器
ECM 腾讯云边缘计算服务器
BM 腾讯云黑石1.0 服务器
Other  其他服务器(非腾讯云)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMachineType() {
        return this.MachineType;
    }

    /**
     * Set 机器类型
CVM 腾讯云云服务器
LH 腾讯云轻量服务器
ECM 腾讯云边缘计算服务器
BM 腾讯云黑石1.0 服务器
Other  其他服务器(非腾讯云)
注意：此字段可能返回 null，表示取不到有效值。
     * @param MachineType 机器类型
CVM 腾讯云云服务器
LH 腾讯云轻量服务器
ECM 腾讯云边缘计算服务器
BM 腾讯云黑石1.0 服务器
Other  其他服务器(非腾讯云)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMachineType(String MachineType) {
        this.MachineType = MachineType;
    }

    /**
     * Get 0 腾讯云
1 IDC机房
2 阿里云
3 华为云
4 亚马逊
5 微软
6 Google
7 Oracle
8 Digital Ocean
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CloudFrom 0 腾讯云
1 IDC机房
2 阿里云
3 华为云
4 亚马逊
5 微软
6 Google
7 Oracle
8 Digital Ocean
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCloudFrom() {
        return this.CloudFrom;
    }

    /**
     * Set 0 腾讯云
1 IDC机房
2 阿里云
3 华为云
4 亚马逊
5 微软
6 Google
7 Oracle
8 Digital Ocean
注意：此字段可能返回 null，表示取不到有效值。
     * @param CloudFrom 0 腾讯云
1 IDC机房
2 阿里云
3 华为云
4 亚马逊
5 微软
6 Google
7 Oracle
8 Digital Ocean
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCloudFrom(Long CloudFrom) {
        this.CloudFrom = CloudFrom;
    }

    /**
     * Get 地域列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RegionList 地域列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RegionInfo [] getRegionList() {
        return this.RegionList;
    }

    /**
     * Set 地域列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param RegionList 地域列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegionList(RegionInfo [] RegionList) {
        this.RegionList = RegionList;
    }

    public RegionListDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RegionListDetail(RegionListDetail source) {
        if (source.MachineType != null) {
            this.MachineType = new String(source.MachineType);
        }
        if (source.CloudFrom != null) {
            this.CloudFrom = new Long(source.CloudFrom);
        }
        if (source.RegionList != null) {
            this.RegionList = new RegionInfo[source.RegionList.length];
            for (int i = 0; i < source.RegionList.length; i++) {
                this.RegionList[i] = new RegionInfo(source.RegionList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MachineType", this.MachineType);
        this.setParamSimple(map, prefix + "CloudFrom", this.CloudFrom);
        this.setParamArrayObj(map, prefix + "RegionList.", this.RegionList);

    }
}

