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

public class CreateServerlessInstanceRequest extends AbstractModel {

    /**
    * 可用区
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 私有网络ID
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 子网ID
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 索引名，需以-AppId结尾
    */
    @SerializedName("IndexName")
    @Expose
    private String IndexName;

    /**
    * 创建的索引元数据JSON，如mappings、settings
    */
    @SerializedName("IndexMetaJson")
    @Expose
    private String IndexMetaJson;

    /**
    * 创建索引的空间ID
    */
    @SerializedName("SpaceId")
    @Expose
    private String SpaceId;

    /**
    * 创建索引的用户名
    */
    @SerializedName("Username")
    @Expose
    private String Username;

    /**
    * 创建索引的密码
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * 创建数据接入
    */
    @SerializedName("ServerlessDi")
    @Expose
    private ServerlessDi ServerlessDi;

    /**
    * 是否自行添加白名单ip
    */
    @SerializedName("AutoGetIp")
    @Expose
    private Long AutoGetIp;

    /**
    * 标签信息
    */
    @SerializedName("TagList")
    @Expose
    private TagInfo [] TagList;

    /**
    * kibana公网白名单
    */
    @SerializedName("KibanaWhiteIpList")
    @Expose
    private String [] KibanaWhiteIpList;

    /**
     * Get 可用区 
     * @return Zone 可用区
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 可用区
     * @param Zone 可用区
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 私有网络ID 
     * @return VpcId 私有网络ID
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 私有网络ID
     * @param VpcId 私有网络ID
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 子网ID 
     * @return SubnetId 子网ID
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 子网ID
     * @param SubnetId 子网ID
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get 索引名，需以-AppId结尾 
     * @return IndexName 索引名，需以-AppId结尾
     */
    public String getIndexName() {
        return this.IndexName;
    }

    /**
     * Set 索引名，需以-AppId结尾
     * @param IndexName 索引名，需以-AppId结尾
     */
    public void setIndexName(String IndexName) {
        this.IndexName = IndexName;
    }

    /**
     * Get 创建的索引元数据JSON，如mappings、settings 
     * @return IndexMetaJson 创建的索引元数据JSON，如mappings、settings
     */
    public String getIndexMetaJson() {
        return this.IndexMetaJson;
    }

    /**
     * Set 创建的索引元数据JSON，如mappings、settings
     * @param IndexMetaJson 创建的索引元数据JSON，如mappings、settings
     */
    public void setIndexMetaJson(String IndexMetaJson) {
        this.IndexMetaJson = IndexMetaJson;
    }

    /**
     * Get 创建索引的空间ID 
     * @return SpaceId 创建索引的空间ID
     */
    public String getSpaceId() {
        return this.SpaceId;
    }

    /**
     * Set 创建索引的空间ID
     * @param SpaceId 创建索引的空间ID
     */
    public void setSpaceId(String SpaceId) {
        this.SpaceId = SpaceId;
    }

    /**
     * Get 创建索引的用户名 
     * @return Username 创建索引的用户名
     */
    public String getUsername() {
        return this.Username;
    }

    /**
     * Set 创建索引的用户名
     * @param Username 创建索引的用户名
     */
    public void setUsername(String Username) {
        this.Username = Username;
    }

    /**
     * Get 创建索引的密码 
     * @return Password 创建索引的密码
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set 创建索引的密码
     * @param Password 创建索引的密码
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get 创建数据接入 
     * @return ServerlessDi 创建数据接入
     */
    public ServerlessDi getServerlessDi() {
        return this.ServerlessDi;
    }

    /**
     * Set 创建数据接入
     * @param ServerlessDi 创建数据接入
     */
    public void setServerlessDi(ServerlessDi ServerlessDi) {
        this.ServerlessDi = ServerlessDi;
    }

    /**
     * Get 是否自行添加白名单ip 
     * @return AutoGetIp 是否自行添加白名单ip
     */
    public Long getAutoGetIp() {
        return this.AutoGetIp;
    }

    /**
     * Set 是否自行添加白名单ip
     * @param AutoGetIp 是否自行添加白名单ip
     */
    public void setAutoGetIp(Long AutoGetIp) {
        this.AutoGetIp = AutoGetIp;
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
     * Get kibana公网白名单 
     * @return KibanaWhiteIpList kibana公网白名单
     */
    public String [] getKibanaWhiteIpList() {
        return this.KibanaWhiteIpList;
    }

    /**
     * Set kibana公网白名单
     * @param KibanaWhiteIpList kibana公网白名单
     */
    public void setKibanaWhiteIpList(String [] KibanaWhiteIpList) {
        this.KibanaWhiteIpList = KibanaWhiteIpList;
    }

    public CreateServerlessInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateServerlessInstanceRequest(CreateServerlessInstanceRequest source) {
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.IndexName != null) {
            this.IndexName = new String(source.IndexName);
        }
        if (source.IndexMetaJson != null) {
            this.IndexMetaJson = new String(source.IndexMetaJson);
        }
        if (source.SpaceId != null) {
            this.SpaceId = new String(source.SpaceId);
        }
        if (source.Username != null) {
            this.Username = new String(source.Username);
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
        if (source.ServerlessDi != null) {
            this.ServerlessDi = new ServerlessDi(source.ServerlessDi);
        }
        if (source.AutoGetIp != null) {
            this.AutoGetIp = new Long(source.AutoGetIp);
        }
        if (source.TagList != null) {
            this.TagList = new TagInfo[source.TagList.length];
            for (int i = 0; i < source.TagList.length; i++) {
                this.TagList[i] = new TagInfo(source.TagList[i]);
            }
        }
        if (source.KibanaWhiteIpList != null) {
            this.KibanaWhiteIpList = new String[source.KibanaWhiteIpList.length];
            for (int i = 0; i < source.KibanaWhiteIpList.length; i++) {
                this.KibanaWhiteIpList[i] = new String(source.KibanaWhiteIpList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "IndexName", this.IndexName);
        this.setParamSimple(map, prefix + "IndexMetaJson", this.IndexMetaJson);
        this.setParamSimple(map, prefix + "SpaceId", this.SpaceId);
        this.setParamSimple(map, prefix + "Username", this.Username);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamObj(map, prefix + "ServerlessDi.", this.ServerlessDi);
        this.setParamSimple(map, prefix + "AutoGetIp", this.AutoGetIp);
        this.setParamArrayObj(map, prefix + "TagList.", this.TagList);
        this.setParamArraySimple(map, prefix + "KibanaWhiteIpList.", this.KibanaWhiteIpList);

    }
}

