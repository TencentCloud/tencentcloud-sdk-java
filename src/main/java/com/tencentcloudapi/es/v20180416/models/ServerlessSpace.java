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
package com.tencentcloudapi.es.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ServerlessSpace extends AbstractModel {

    /**
    * Serverless索引空间ID
    */
    @SerializedName("SpaceId")
    @Expose
    private String SpaceId;

    /**
    * Serverless索引空间名
    */
    @SerializedName("SpaceName")
    @Expose
    private String SpaceName;

    /**
    * Serverless索引空间状态，0正常，-1已删除
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 创建日期
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 空间内索引数量
    */
    @SerializedName("IndexCount")
    @Expose
    private Long IndexCount;

    /**
    * kibana公网uri
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("KibanaUrl")
    @Expose
    private String KibanaUrl;

    /**
    * kibana内网url
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("KibanaPrivateUrl")
    @Expose
    private String KibanaPrivateUrl;

    /**
    * 空间内网访问地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IndexAccessUrl")
    @Expose
    private String IndexAccessUrl;

    /**
    * 空间白名单
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("KibanaPublicAcl")
    @Expose
    private EsAcl KibanaPublicAcl;

    /**
    * 空间检索分析域名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("KibanaEmbedUrl")
    @Expose
    private String KibanaEmbedUrl;

    /**
    * 数据联路
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DiDataList")
    @Expose
    private DiData DiDataList;

    /**
    * 空间vpc信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VpcInfo")
    @Expose
    private VpcInfo [] VpcInfo;

    /**
    * 地域
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 可用区
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * kibana公网开关，0关闭，1开启
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EnableKibanaPublicAccess")
    @Expose
    private Long EnableKibanaPublicAccess;

    /**
    * kibana内网开关，0关闭，1开启
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EnableKibanaPrivateAccess")
    @Expose
    private Long EnableKibanaPrivateAccess;

    /**
    * 空间所属appid
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
     * Get Serverless索引空间ID 
     * @return SpaceId Serverless索引空间ID
     */
    public String getSpaceId() {
        return this.SpaceId;
    }

    /**
     * Set Serverless索引空间ID
     * @param SpaceId Serverless索引空间ID
     */
    public void setSpaceId(String SpaceId) {
        this.SpaceId = SpaceId;
    }

    /**
     * Get Serverless索引空间名 
     * @return SpaceName Serverless索引空间名
     */
    public String getSpaceName() {
        return this.SpaceName;
    }

    /**
     * Set Serverless索引空间名
     * @param SpaceName Serverless索引空间名
     */
    public void setSpaceName(String SpaceName) {
        this.SpaceName = SpaceName;
    }

    /**
     * Get Serverless索引空间状态，0正常，-1已删除 
     * @return Status Serverless索引空间状态，0正常，-1已删除
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Serverless索引空间状态，0正常，-1已删除
     * @param Status Serverless索引空间状态，0正常，-1已删除
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 创建日期 
     * @return CreateTime 创建日期
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建日期
     * @param CreateTime 创建日期
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 空间内索引数量 
     * @return IndexCount 空间内索引数量
     */
    public Long getIndexCount() {
        return this.IndexCount;
    }

    /**
     * Set 空间内索引数量
     * @param IndexCount 空间内索引数量
     */
    public void setIndexCount(Long IndexCount) {
        this.IndexCount = IndexCount;
    }

    /**
     * Get kibana公网uri
注意：此字段可能返回 null，表示取不到有效值。 
     * @return KibanaUrl kibana公网uri
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getKibanaUrl() {
        return this.KibanaUrl;
    }

    /**
     * Set kibana公网uri
注意：此字段可能返回 null，表示取不到有效值。
     * @param KibanaUrl kibana公网uri
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKibanaUrl(String KibanaUrl) {
        this.KibanaUrl = KibanaUrl;
    }

    /**
     * Get kibana内网url
注意：此字段可能返回 null，表示取不到有效值。 
     * @return KibanaPrivateUrl kibana内网url
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getKibanaPrivateUrl() {
        return this.KibanaPrivateUrl;
    }

    /**
     * Set kibana内网url
注意：此字段可能返回 null，表示取不到有效值。
     * @param KibanaPrivateUrl kibana内网url
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKibanaPrivateUrl(String KibanaPrivateUrl) {
        this.KibanaPrivateUrl = KibanaPrivateUrl;
    }

    /**
     * Get 空间内网访问地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IndexAccessUrl 空间内网访问地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIndexAccessUrl() {
        return this.IndexAccessUrl;
    }

    /**
     * Set 空间内网访问地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param IndexAccessUrl 空间内网访问地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIndexAccessUrl(String IndexAccessUrl) {
        this.IndexAccessUrl = IndexAccessUrl;
    }

    /**
     * Get 空间白名单
注意：此字段可能返回 null，表示取不到有效值。 
     * @return KibanaPublicAcl 空间白名单
注意：此字段可能返回 null，表示取不到有效值。
     */
    public EsAcl getKibanaPublicAcl() {
        return this.KibanaPublicAcl;
    }

    /**
     * Set 空间白名单
注意：此字段可能返回 null，表示取不到有效值。
     * @param KibanaPublicAcl 空间白名单
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKibanaPublicAcl(EsAcl KibanaPublicAcl) {
        this.KibanaPublicAcl = KibanaPublicAcl;
    }

    /**
     * Get 空间检索分析域名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return KibanaEmbedUrl 空间检索分析域名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getKibanaEmbedUrl() {
        return this.KibanaEmbedUrl;
    }

    /**
     * Set 空间检索分析域名
注意：此字段可能返回 null，表示取不到有效值。
     * @param KibanaEmbedUrl 空间检索分析域名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKibanaEmbedUrl(String KibanaEmbedUrl) {
        this.KibanaEmbedUrl = KibanaEmbedUrl;
    }

    /**
     * Get 数据联路
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DiDataList 数据联路
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DiData getDiDataList() {
        return this.DiDataList;
    }

    /**
     * Set 数据联路
注意：此字段可能返回 null，表示取不到有效值。
     * @param DiDataList 数据联路
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDiDataList(DiData DiDataList) {
        this.DiDataList = DiDataList;
    }

    /**
     * Get 空间vpc信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VpcInfo 空间vpc信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public VpcInfo [] getVpcInfo() {
        return this.VpcInfo;
    }

    /**
     * Set 空间vpc信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param VpcInfo 空间vpc信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVpcInfo(VpcInfo [] VpcInfo) {
        this.VpcInfo = VpcInfo;
    }

    /**
     * Get 地域
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Region 地域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 地域
注意：此字段可能返回 null，表示取不到有效值。
     * @param Region 地域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 可用区
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Zone 可用区
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 可用区
注意：此字段可能返回 null，表示取不到有效值。
     * @param Zone 可用区
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get kibana公网开关，0关闭，1开启
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EnableKibanaPublicAccess kibana公网开关，0关闭，1开启
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getEnableKibanaPublicAccess() {
        return this.EnableKibanaPublicAccess;
    }

    /**
     * Set kibana公网开关，0关闭，1开启
注意：此字段可能返回 null，表示取不到有效值。
     * @param EnableKibanaPublicAccess kibana公网开关，0关闭，1开启
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnableKibanaPublicAccess(Long EnableKibanaPublicAccess) {
        this.EnableKibanaPublicAccess = EnableKibanaPublicAccess;
    }

    /**
     * Get kibana内网开关，0关闭，1开启
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EnableKibanaPrivateAccess kibana内网开关，0关闭，1开启
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getEnableKibanaPrivateAccess() {
        return this.EnableKibanaPrivateAccess;
    }

    /**
     * Set kibana内网开关，0关闭，1开启
注意：此字段可能返回 null，表示取不到有效值。
     * @param EnableKibanaPrivateAccess kibana内网开关，0关闭，1开启
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnableKibanaPrivateAccess(Long EnableKibanaPrivateAccess) {
        this.EnableKibanaPrivateAccess = EnableKibanaPrivateAccess;
    }

    /**
     * Get 空间所属appid
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AppId 空间所属appid
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set 空间所属appid
注意：此字段可能返回 null，表示取不到有效值。
     * @param AppId 空间所属appid
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    public ServerlessSpace() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ServerlessSpace(ServerlessSpace source) {
        if (source.SpaceId != null) {
            this.SpaceId = new String(source.SpaceId);
        }
        if (source.SpaceName != null) {
            this.SpaceName = new String(source.SpaceName);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.IndexCount != null) {
            this.IndexCount = new Long(source.IndexCount);
        }
        if (source.KibanaUrl != null) {
            this.KibanaUrl = new String(source.KibanaUrl);
        }
        if (source.KibanaPrivateUrl != null) {
            this.KibanaPrivateUrl = new String(source.KibanaPrivateUrl);
        }
        if (source.IndexAccessUrl != null) {
            this.IndexAccessUrl = new String(source.IndexAccessUrl);
        }
        if (source.KibanaPublicAcl != null) {
            this.KibanaPublicAcl = new EsAcl(source.KibanaPublicAcl);
        }
        if (source.KibanaEmbedUrl != null) {
            this.KibanaEmbedUrl = new String(source.KibanaEmbedUrl);
        }
        if (source.DiDataList != null) {
            this.DiDataList = new DiData(source.DiDataList);
        }
        if (source.VpcInfo != null) {
            this.VpcInfo = new VpcInfo[source.VpcInfo.length];
            for (int i = 0; i < source.VpcInfo.length; i++) {
                this.VpcInfo[i] = new VpcInfo(source.VpcInfo[i]);
            }
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.EnableKibanaPublicAccess != null) {
            this.EnableKibanaPublicAccess = new Long(source.EnableKibanaPublicAccess);
        }
        if (source.EnableKibanaPrivateAccess != null) {
            this.EnableKibanaPrivateAccess = new Long(source.EnableKibanaPrivateAccess);
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SpaceId", this.SpaceId);
        this.setParamSimple(map, prefix + "SpaceName", this.SpaceName);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "IndexCount", this.IndexCount);
        this.setParamSimple(map, prefix + "KibanaUrl", this.KibanaUrl);
        this.setParamSimple(map, prefix + "KibanaPrivateUrl", this.KibanaPrivateUrl);
        this.setParamSimple(map, prefix + "IndexAccessUrl", this.IndexAccessUrl);
        this.setParamObj(map, prefix + "KibanaPublicAcl.", this.KibanaPublicAcl);
        this.setParamSimple(map, prefix + "KibanaEmbedUrl", this.KibanaEmbedUrl);
        this.setParamObj(map, prefix + "DiDataList.", this.DiDataList);
        this.setParamArrayObj(map, prefix + "VpcInfo.", this.VpcInfo);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "EnableKibanaPublicAccess", this.EnableKibanaPublicAccess);
        this.setParamSimple(map, prefix + "EnableKibanaPrivateAccess", this.EnableKibanaPrivateAccess);
        this.setParamSimple(map, prefix + "AppId", this.AppId);

    }
}

