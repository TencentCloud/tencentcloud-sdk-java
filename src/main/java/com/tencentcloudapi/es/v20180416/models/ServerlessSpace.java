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
package com.tencentcloudapi.es.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ServerlessSpace extends AbstractModel {

    /**
    * <p>Serverless索引空间ID</p>
    */
    @SerializedName("SpaceId")
    @Expose
    private String SpaceId;

    /**
    * <p>Serverless索引空间名</p>
    */
    @SerializedName("SpaceName")
    @Expose
    private String SpaceName;

    /**
    * <p>Serverless索引空间状态</p><p>枚举值：</p><ul><li>0： 创建中</li><li>1： 正常</li><li>2： 流程中</li><li>-3： 已删除</li><li>-4： 隔离中</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>创建日期</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>空间内索引数量</p>
    */
    @SerializedName("IndexCount")
    @Expose
    private Long IndexCount;

    /**
    * <p>kibana公网uri</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("KibanaUrl")
    @Expose
    private String KibanaUrl;

    /**
    * <p>kibana内网url</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("KibanaPrivateUrl")
    @Expose
    private String KibanaPrivateUrl;

    /**
    * <p>空间内网访问地址</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IndexAccessUrl")
    @Expose
    private String IndexAccessUrl;

    /**
    * <p>空间白名单</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("KibanaPublicAcl")
    @Expose
    private EsAcl KibanaPublicAcl;

    /**
    * <p>空间检索分析域名</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("KibanaEmbedUrl")
    @Expose
    private String KibanaEmbedUrl;

    /**
    * <p>数据联路</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DiDataList")
    @Expose
    private DiData DiDataList;

    /**
    * <p>空间vpc信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VpcInfo")
    @Expose
    private VpcInfo [] VpcInfo;

    /**
    * <p>地域</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * <p>可用区</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * <p>kibana公网开关，0关闭，1开启</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EnableKibanaPublicAccess")
    @Expose
    private Long EnableKibanaPublicAccess;

    /**
    * <p>kibana内网开关，0关闭，1开启</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EnableKibanaPrivateAccess")
    @Expose
    private Long EnableKibanaPrivateAccess;

    /**
    * <p>空间所属appid</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * <p>//默认en， 可选zh-CN</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("KibanaLanguage")
    @Expose
    private String KibanaLanguage;

    /**
    * <p>0</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClusterType")
    @Expose
    private Long ClusterType;

    /**
    * <p>空间标签信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TagList")
    @Expose
    private TagInfo [] TagList;

    /**
    * <p>是否开启mcp服务</p>
    */
    @SerializedName("EnableMcpAccess")
    @Expose
    private Long EnableMcpAccess;

    /**
    * <p>mcp的访问地址</p>
    */
    @SerializedName("McpAccess")
    @Expose
    private String McpAccess;

    /**
     * Get <p>Serverless索引空间ID</p> 
     * @return SpaceId <p>Serverless索引空间ID</p>
     */
    public String getSpaceId() {
        return this.SpaceId;
    }

    /**
     * Set <p>Serverless索引空间ID</p>
     * @param SpaceId <p>Serverless索引空间ID</p>
     */
    public void setSpaceId(String SpaceId) {
        this.SpaceId = SpaceId;
    }

    /**
     * Get <p>Serverless索引空间名</p> 
     * @return SpaceName <p>Serverless索引空间名</p>
     */
    public String getSpaceName() {
        return this.SpaceName;
    }

    /**
     * Set <p>Serverless索引空间名</p>
     * @param SpaceName <p>Serverless索引空间名</p>
     */
    public void setSpaceName(String SpaceName) {
        this.SpaceName = SpaceName;
    }

    /**
     * Get <p>Serverless索引空间状态</p><p>枚举值：</p><ul><li>0： 创建中</li><li>1： 正常</li><li>2： 流程中</li><li>-3： 已删除</li><li>-4： 隔离中</li></ul> 
     * @return Status <p>Serverless索引空间状态</p><p>枚举值：</p><ul><li>0： 创建中</li><li>1： 正常</li><li>2： 流程中</li><li>-3： 已删除</li><li>-4： 隔离中</li></ul>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Serverless索引空间状态</p><p>枚举值：</p><ul><li>0： 创建中</li><li>1： 正常</li><li>2： 流程中</li><li>-3： 已删除</li><li>-4： 隔离中</li></ul>
     * @param Status <p>Serverless索引空间状态</p><p>枚举值：</p><ul><li>0： 创建中</li><li>1： 正常</li><li>2： 流程中</li><li>-3： 已删除</li><li>-4： 隔离中</li></ul>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>创建日期</p> 
     * @return CreateTime <p>创建日期</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建日期</p>
     * @param CreateTime <p>创建日期</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>空间内索引数量</p> 
     * @return IndexCount <p>空间内索引数量</p>
     */
    public Long getIndexCount() {
        return this.IndexCount;
    }

    /**
     * Set <p>空间内索引数量</p>
     * @param IndexCount <p>空间内索引数量</p>
     */
    public void setIndexCount(Long IndexCount) {
        this.IndexCount = IndexCount;
    }

    /**
     * Get <p>kibana公网uri</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return KibanaUrl <p>kibana公网uri</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getKibanaUrl() {
        return this.KibanaUrl;
    }

    /**
     * Set <p>kibana公网uri</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param KibanaUrl <p>kibana公网uri</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKibanaUrl(String KibanaUrl) {
        this.KibanaUrl = KibanaUrl;
    }

    /**
     * Get <p>kibana内网url</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return KibanaPrivateUrl <p>kibana内网url</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getKibanaPrivateUrl() {
        return this.KibanaPrivateUrl;
    }

    /**
     * Set <p>kibana内网url</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param KibanaPrivateUrl <p>kibana内网url</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKibanaPrivateUrl(String KibanaPrivateUrl) {
        this.KibanaPrivateUrl = KibanaPrivateUrl;
    }

    /**
     * Get <p>空间内网访问地址</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IndexAccessUrl <p>空间内网访问地址</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIndexAccessUrl() {
        return this.IndexAccessUrl;
    }

    /**
     * Set <p>空间内网访问地址</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param IndexAccessUrl <p>空间内网访问地址</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIndexAccessUrl(String IndexAccessUrl) {
        this.IndexAccessUrl = IndexAccessUrl;
    }

    /**
     * Get <p>空间白名单</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return KibanaPublicAcl <p>空间白名单</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public EsAcl getKibanaPublicAcl() {
        return this.KibanaPublicAcl;
    }

    /**
     * Set <p>空间白名单</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param KibanaPublicAcl <p>空间白名单</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKibanaPublicAcl(EsAcl KibanaPublicAcl) {
        this.KibanaPublicAcl = KibanaPublicAcl;
    }

    /**
     * Get <p>空间检索分析域名</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return KibanaEmbedUrl <p>空间检索分析域名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getKibanaEmbedUrl() {
        return this.KibanaEmbedUrl;
    }

    /**
     * Set <p>空间检索分析域名</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param KibanaEmbedUrl <p>空间检索分析域名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKibanaEmbedUrl(String KibanaEmbedUrl) {
        this.KibanaEmbedUrl = KibanaEmbedUrl;
    }

    /**
     * Get <p>数据联路</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DiDataList <p>数据联路</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DiData getDiDataList() {
        return this.DiDataList;
    }

    /**
     * Set <p>数据联路</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DiDataList <p>数据联路</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDiDataList(DiData DiDataList) {
        this.DiDataList = DiDataList;
    }

    /**
     * Get <p>空间vpc信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VpcInfo <p>空间vpc信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public VpcInfo [] getVpcInfo() {
        return this.VpcInfo;
    }

    /**
     * Set <p>空间vpc信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param VpcInfo <p>空间vpc信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVpcInfo(VpcInfo [] VpcInfo) {
        this.VpcInfo = VpcInfo;
    }

    /**
     * Get <p>地域</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Region <p>地域</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set <p>地域</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Region <p>地域</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get <p>可用区</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Zone <p>可用区</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set <p>可用区</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Zone <p>可用区</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get <p>kibana公网开关，0关闭，1开启</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EnableKibanaPublicAccess <p>kibana公网开关，0关闭，1开启</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getEnableKibanaPublicAccess() {
        return this.EnableKibanaPublicAccess;
    }

    /**
     * Set <p>kibana公网开关，0关闭，1开启</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param EnableKibanaPublicAccess <p>kibana公网开关，0关闭，1开启</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnableKibanaPublicAccess(Long EnableKibanaPublicAccess) {
        this.EnableKibanaPublicAccess = EnableKibanaPublicAccess;
    }

    /**
     * Get <p>kibana内网开关，0关闭，1开启</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EnableKibanaPrivateAccess <p>kibana内网开关，0关闭，1开启</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getEnableKibanaPrivateAccess() {
        return this.EnableKibanaPrivateAccess;
    }

    /**
     * Set <p>kibana内网开关，0关闭，1开启</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param EnableKibanaPrivateAccess <p>kibana内网开关，0关闭，1开启</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnableKibanaPrivateAccess(Long EnableKibanaPrivateAccess) {
        this.EnableKibanaPrivateAccess = EnableKibanaPrivateAccess;
    }

    /**
     * Get <p>空间所属appid</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AppId <p>空间所属appid</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>空间所属appid</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AppId <p>空间所属appid</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>//默认en， 可选zh-CN</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return KibanaLanguage <p>//默认en， 可选zh-CN</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getKibanaLanguage() {
        return this.KibanaLanguage;
    }

    /**
     * Set <p>//默认en， 可选zh-CN</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param KibanaLanguage <p>//默认en， 可选zh-CN</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKibanaLanguage(String KibanaLanguage) {
        this.KibanaLanguage = KibanaLanguage;
    }

    /**
     * Get <p>0</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClusterType <p>0</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getClusterType() {
        return this.ClusterType;
    }

    /**
     * Set <p>0</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClusterType <p>0</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClusterType(Long ClusterType) {
        this.ClusterType = ClusterType;
    }

    /**
     * Get <p>空间标签信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TagList <p>空间标签信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TagInfo [] getTagList() {
        return this.TagList;
    }

    /**
     * Set <p>空间标签信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TagList <p>空间标签信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTagList(TagInfo [] TagList) {
        this.TagList = TagList;
    }

    /**
     * Get <p>是否开启mcp服务</p> 
     * @return EnableMcpAccess <p>是否开启mcp服务</p>
     */
    public Long getEnableMcpAccess() {
        return this.EnableMcpAccess;
    }

    /**
     * Set <p>是否开启mcp服务</p>
     * @param EnableMcpAccess <p>是否开启mcp服务</p>
     */
    public void setEnableMcpAccess(Long EnableMcpAccess) {
        this.EnableMcpAccess = EnableMcpAccess;
    }

    /**
     * Get <p>mcp的访问地址</p> 
     * @return McpAccess <p>mcp的访问地址</p>
     */
    public String getMcpAccess() {
        return this.McpAccess;
    }

    /**
     * Set <p>mcp的访问地址</p>
     * @param McpAccess <p>mcp的访问地址</p>
     */
    public void setMcpAccess(String McpAccess) {
        this.McpAccess = McpAccess;
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
        if (source.KibanaLanguage != null) {
            this.KibanaLanguage = new String(source.KibanaLanguage);
        }
        if (source.ClusterType != null) {
            this.ClusterType = new Long(source.ClusterType);
        }
        if (source.TagList != null) {
            this.TagList = new TagInfo[source.TagList.length];
            for (int i = 0; i < source.TagList.length; i++) {
                this.TagList[i] = new TagInfo(source.TagList[i]);
            }
        }
        if (source.EnableMcpAccess != null) {
            this.EnableMcpAccess = new Long(source.EnableMcpAccess);
        }
        if (source.McpAccess != null) {
            this.McpAccess = new String(source.McpAccess);
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
        this.setParamSimple(map, prefix + "KibanaLanguage", this.KibanaLanguage);
        this.setParamSimple(map, prefix + "ClusterType", this.ClusterType);
        this.setParamArrayObj(map, prefix + "TagList.", this.TagList);
        this.setParamSimple(map, prefix + "EnableMcpAccess", this.EnableMcpAccess);
        this.setParamSimple(map, prefix + "McpAccess", this.McpAccess);

    }
}

