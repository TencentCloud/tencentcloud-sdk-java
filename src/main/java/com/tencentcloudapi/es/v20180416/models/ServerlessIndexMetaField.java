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

public class ServerlessIndexMetaField extends AbstractModel {

    /**
    * 索引所属集群APP ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * 索引名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IndexName")
    @Expose
    private String IndexName;

    /**
    * 索引文档数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IndexDocs")
    @Expose
    private Long IndexDocs;

    /**
    * 索引存储大小，单位Byte
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IndexStorage")
    @Expose
    private Long IndexStorage;

    /**
    * 索引创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IndexCreateTime")
    @Expose
    private String IndexCreateTime;

    /**
    * 索引实例ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 索引自治字段
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IndexOptionsField")
    @Expose
    private ServerlessIndexOptionsField IndexOptionsField;

    /**
    * 索引配置字段
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IndexSettingsField")
    @Expose
    private ServerlessIndexSettingsField IndexSettingsField;

    /**
    * 索引所属连接相关信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IndexNetworkField")
    @Expose
    private ServerlessIndexNetworkField IndexNetworkField;

    /**
    * Kibana公网域名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("KibanaUrl")
    @Expose
    private String KibanaUrl;

    /**
    * Kibana内网域名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("KibanaPrivateUrl")
    @Expose
    private String KibanaPrivateUrl;

    /**
    * 索引内网访问地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IndexAccessUrl")
    @Expose
    private String IndexAccessUrl;

    /**
    * 状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 索引空间ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SpaceId")
    @Expose
    private String SpaceId;

    /**
    * 索引空间名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SpaceName")
    @Expose
    private String SpaceName;

    /**
    * 存储类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StorageType")
    @Expose
    private Long StorageType;

    /**
    * 标签信息
    */
    @SerializedName("TagList")
    @Expose
    private TagInfo [] TagList;

    /**
    * 3782478.47
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IndexTraffic")
    @Expose
    private Float IndexTraffic;

    /**
     * Get 索引所属集群APP ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AppId 索引所属集群APP ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set 索引所属集群APP ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param AppId 索引所属集群APP ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get 索引名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IndexName 索引名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIndexName() {
        return this.IndexName;
    }

    /**
     * Set 索引名
注意：此字段可能返回 null，表示取不到有效值。
     * @param IndexName 索引名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIndexName(String IndexName) {
        this.IndexName = IndexName;
    }

    /**
     * Get 索引文档数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IndexDocs 索引文档数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIndexDocs() {
        return this.IndexDocs;
    }

    /**
     * Set 索引文档数
注意：此字段可能返回 null，表示取不到有效值。
     * @param IndexDocs 索引文档数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIndexDocs(Long IndexDocs) {
        this.IndexDocs = IndexDocs;
    }

    /**
     * Get 索引存储大小，单位Byte
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IndexStorage 索引存储大小，单位Byte
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIndexStorage() {
        return this.IndexStorage;
    }

    /**
     * Set 索引存储大小，单位Byte
注意：此字段可能返回 null，表示取不到有效值。
     * @param IndexStorage 索引存储大小，单位Byte
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIndexStorage(Long IndexStorage) {
        this.IndexStorage = IndexStorage;
    }

    /**
     * Get 索引创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IndexCreateTime 索引创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIndexCreateTime() {
        return this.IndexCreateTime;
    }

    /**
     * Set 索引创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param IndexCreateTime 索引创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIndexCreateTime(String IndexCreateTime) {
        this.IndexCreateTime = IndexCreateTime;
    }

    /**
     * Get 索引实例ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceId 索引实例ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 索引实例ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceId 索引实例ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 索引自治字段
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IndexOptionsField 索引自治字段
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ServerlessIndexOptionsField getIndexOptionsField() {
        return this.IndexOptionsField;
    }

    /**
     * Set 索引自治字段
注意：此字段可能返回 null，表示取不到有效值。
     * @param IndexOptionsField 索引自治字段
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIndexOptionsField(ServerlessIndexOptionsField IndexOptionsField) {
        this.IndexOptionsField = IndexOptionsField;
    }

    /**
     * Get 索引配置字段
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IndexSettingsField 索引配置字段
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ServerlessIndexSettingsField getIndexSettingsField() {
        return this.IndexSettingsField;
    }

    /**
     * Set 索引配置字段
注意：此字段可能返回 null，表示取不到有效值。
     * @param IndexSettingsField 索引配置字段
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIndexSettingsField(ServerlessIndexSettingsField IndexSettingsField) {
        this.IndexSettingsField = IndexSettingsField;
    }

    /**
     * Get 索引所属连接相关信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IndexNetworkField 索引所属连接相关信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ServerlessIndexNetworkField getIndexNetworkField() {
        return this.IndexNetworkField;
    }

    /**
     * Set 索引所属连接相关信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param IndexNetworkField 索引所属连接相关信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIndexNetworkField(ServerlessIndexNetworkField IndexNetworkField) {
        this.IndexNetworkField = IndexNetworkField;
    }

    /**
     * Get Kibana公网域名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return KibanaUrl Kibana公网域名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getKibanaUrl() {
        return this.KibanaUrl;
    }

    /**
     * Set Kibana公网域名
注意：此字段可能返回 null，表示取不到有效值。
     * @param KibanaUrl Kibana公网域名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKibanaUrl(String KibanaUrl) {
        this.KibanaUrl = KibanaUrl;
    }

    /**
     * Get Kibana内网域名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return KibanaPrivateUrl Kibana内网域名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getKibanaPrivateUrl() {
        return this.KibanaPrivateUrl;
    }

    /**
     * Set Kibana内网域名
注意：此字段可能返回 null，表示取不到有效值。
     * @param KibanaPrivateUrl Kibana内网域名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKibanaPrivateUrl(String KibanaPrivateUrl) {
        this.KibanaPrivateUrl = KibanaPrivateUrl;
    }

    /**
     * Get 索引内网访问地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IndexAccessUrl 索引内网访问地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIndexAccessUrl() {
        return this.IndexAccessUrl;
    }

    /**
     * Set 索引内网访问地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param IndexAccessUrl 索引内网访问地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIndexAccessUrl(String IndexAccessUrl) {
        this.IndexAccessUrl = IndexAccessUrl;
    }

    /**
     * Get 状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 索引空间ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SpaceId 索引空间ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSpaceId() {
        return this.SpaceId;
    }

    /**
     * Set 索引空间ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param SpaceId 索引空间ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSpaceId(String SpaceId) {
        this.SpaceId = SpaceId;
    }

    /**
     * Get 索引空间名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SpaceName 索引空间名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSpaceName() {
        return this.SpaceName;
    }

    /**
     * Set 索引空间名
注意：此字段可能返回 null，表示取不到有效值。
     * @param SpaceName 索引空间名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSpaceName(String SpaceName) {
        this.SpaceName = SpaceName;
    }

    /**
     * Get 存储类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StorageType 存储类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStorageType() {
        return this.StorageType;
    }

    /**
     * Set 存储类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param StorageType 存储类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStorageType(Long StorageType) {
        this.StorageType = StorageType;
    }

    /**
     * Get 标签信息 
     * @return TagList 标签信息
     */
    public TagInfo [] getTagList() {
        return this.TagList;
    }

    /**
     * Set 标签信息
     * @param TagList 标签信息
     */
    public void setTagList(TagInfo [] TagList) {
        this.TagList = TagList;
    }

    /**
     * Get 3782478.47
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IndexTraffic 3782478.47
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getIndexTraffic() {
        return this.IndexTraffic;
    }

    /**
     * Set 3782478.47
注意：此字段可能返回 null，表示取不到有效值。
     * @param IndexTraffic 3782478.47
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIndexTraffic(Float IndexTraffic) {
        this.IndexTraffic = IndexTraffic;
    }

    public ServerlessIndexMetaField() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ServerlessIndexMetaField(ServerlessIndexMetaField source) {
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.IndexName != null) {
            this.IndexName = new String(source.IndexName);
        }
        if (source.IndexDocs != null) {
            this.IndexDocs = new Long(source.IndexDocs);
        }
        if (source.IndexStorage != null) {
            this.IndexStorage = new Long(source.IndexStorage);
        }
        if (source.IndexCreateTime != null) {
            this.IndexCreateTime = new String(source.IndexCreateTime);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.IndexOptionsField != null) {
            this.IndexOptionsField = new ServerlessIndexOptionsField(source.IndexOptionsField);
        }
        if (source.IndexSettingsField != null) {
            this.IndexSettingsField = new ServerlessIndexSettingsField(source.IndexSettingsField);
        }
        if (source.IndexNetworkField != null) {
            this.IndexNetworkField = new ServerlessIndexNetworkField(source.IndexNetworkField);
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
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.SpaceId != null) {
            this.SpaceId = new String(source.SpaceId);
        }
        if (source.SpaceName != null) {
            this.SpaceName = new String(source.SpaceName);
        }
        if (source.StorageType != null) {
            this.StorageType = new Long(source.StorageType);
        }
        if (source.TagList != null) {
            this.TagList = new TagInfo[source.TagList.length];
            for (int i = 0; i < source.TagList.length; i++) {
                this.TagList[i] = new TagInfo(source.TagList[i]);
            }
        }
        if (source.IndexTraffic != null) {
            this.IndexTraffic = new Float(source.IndexTraffic);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "IndexName", this.IndexName);
        this.setParamSimple(map, prefix + "IndexDocs", this.IndexDocs);
        this.setParamSimple(map, prefix + "IndexStorage", this.IndexStorage);
        this.setParamSimple(map, prefix + "IndexCreateTime", this.IndexCreateTime);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamObj(map, prefix + "IndexOptionsField.", this.IndexOptionsField);
        this.setParamObj(map, prefix + "IndexSettingsField.", this.IndexSettingsField);
        this.setParamObj(map, prefix + "IndexNetworkField.", this.IndexNetworkField);
        this.setParamSimple(map, prefix + "KibanaUrl", this.KibanaUrl);
        this.setParamSimple(map, prefix + "KibanaPrivateUrl", this.KibanaPrivateUrl);
        this.setParamSimple(map, prefix + "IndexAccessUrl", this.IndexAccessUrl);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "SpaceId", this.SpaceId);
        this.setParamSimple(map, prefix + "SpaceName", this.SpaceName);
        this.setParamSimple(map, prefix + "StorageType", this.StorageType);
        this.setParamArrayObj(map, prefix + "TagList.", this.TagList);
        this.setParamSimple(map, prefix + "IndexTraffic", this.IndexTraffic);

    }
}

