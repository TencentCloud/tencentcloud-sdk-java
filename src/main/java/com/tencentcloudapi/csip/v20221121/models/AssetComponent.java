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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AssetComponent extends AbstractModel {

    /**
    * <p>组件名</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>组件版本</p>
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * <p>组件类型</p>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>首次发现时间</p><p>参数格式：YYYY-MM-DD hh:mm:ss</p>
    */
    @SerializedName("FirstFoundTime")
    @Expose
    private String FirstFoundTime;

    /**
    * <p>最后发现时间</p><p>参数格式：YYYY-MM-DD hh:mm:ss</p>
    */
    @SerializedName("LatestFoundTime")
    @Expose
    private String LatestFoundTime;

    /**
    * <p>组件id</p>
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * <p>组件所属账号名</p>
    */
    @SerializedName("OwnerAccountName")
    @Expose
    private String OwnerAccountName;

    /**
    * <p>组件所属账号appid</p>
    */
    @SerializedName("OwnerAppId")
    @Expose
    private Long OwnerAppId;

    /**
    * <p>组件所属账号uin</p>
    */
    @SerializedName("OwnerUin")
    @Expose
    private String OwnerUin;

    /**
    * <p>影响镜像数</p>
    */
    @SerializedName("AffectedImageCount")
    @Expose
    private Long AffectedImageCount;

    /**
     * Get <p>组件名</p> 
     * @return Name <p>组件名</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>组件名</p>
     * @param Name <p>组件名</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>组件版本</p> 
     * @return Version <p>组件版本</p>
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set <p>组件版本</p>
     * @param Version <p>组件版本</p>
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get <p>组件类型</p> 
     * @return Type <p>组件类型</p>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>组件类型</p>
     * @param Type <p>组件类型</p>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>首次发现时间</p><p>参数格式：YYYY-MM-DD hh:mm:ss</p> 
     * @return FirstFoundTime <p>首次发现时间</p><p>参数格式：YYYY-MM-DD hh:mm:ss</p>
     */
    public String getFirstFoundTime() {
        return this.FirstFoundTime;
    }

    /**
     * Set <p>首次发现时间</p><p>参数格式：YYYY-MM-DD hh:mm:ss</p>
     * @param FirstFoundTime <p>首次发现时间</p><p>参数格式：YYYY-MM-DD hh:mm:ss</p>
     */
    public void setFirstFoundTime(String FirstFoundTime) {
        this.FirstFoundTime = FirstFoundTime;
    }

    /**
     * Get <p>最后发现时间</p><p>参数格式：YYYY-MM-DD hh:mm:ss</p> 
     * @return LatestFoundTime <p>最后发现时间</p><p>参数格式：YYYY-MM-DD hh:mm:ss</p>
     */
    public String getLatestFoundTime() {
        return this.LatestFoundTime;
    }

    /**
     * Set <p>最后发现时间</p><p>参数格式：YYYY-MM-DD hh:mm:ss</p>
     * @param LatestFoundTime <p>最后发现时间</p><p>参数格式：YYYY-MM-DD hh:mm:ss</p>
     */
    public void setLatestFoundTime(String LatestFoundTime) {
        this.LatestFoundTime = LatestFoundTime;
    }

    /**
     * Get <p>组件id</p> 
     * @return Id <p>组件id</p>
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set <p>组件id</p>
     * @param Id <p>组件id</p>
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get <p>组件所属账号名</p> 
     * @return OwnerAccountName <p>组件所属账号名</p>
     */
    public String getOwnerAccountName() {
        return this.OwnerAccountName;
    }

    /**
     * Set <p>组件所属账号名</p>
     * @param OwnerAccountName <p>组件所属账号名</p>
     */
    public void setOwnerAccountName(String OwnerAccountName) {
        this.OwnerAccountName = OwnerAccountName;
    }

    /**
     * Get <p>组件所属账号appid</p> 
     * @return OwnerAppId <p>组件所属账号appid</p>
     */
    public Long getOwnerAppId() {
        return this.OwnerAppId;
    }

    /**
     * Set <p>组件所属账号appid</p>
     * @param OwnerAppId <p>组件所属账号appid</p>
     */
    public void setOwnerAppId(Long OwnerAppId) {
        this.OwnerAppId = OwnerAppId;
    }

    /**
     * Get <p>组件所属账号uin</p> 
     * @return OwnerUin <p>组件所属账号uin</p>
     */
    public String getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set <p>组件所属账号uin</p>
     * @param OwnerUin <p>组件所属账号uin</p>
     */
    public void setOwnerUin(String OwnerUin) {
        this.OwnerUin = OwnerUin;
    }

    /**
     * Get <p>影响镜像数</p> 
     * @return AffectedImageCount <p>影响镜像数</p>
     */
    public Long getAffectedImageCount() {
        return this.AffectedImageCount;
    }

    /**
     * Set <p>影响镜像数</p>
     * @param AffectedImageCount <p>影响镜像数</p>
     */
    public void setAffectedImageCount(Long AffectedImageCount) {
        this.AffectedImageCount = AffectedImageCount;
    }

    public AssetComponent() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AssetComponent(AssetComponent source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.FirstFoundTime != null) {
            this.FirstFoundTime = new String(source.FirstFoundTime);
        }
        if (source.LatestFoundTime != null) {
            this.LatestFoundTime = new String(source.LatestFoundTime);
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.OwnerAccountName != null) {
            this.OwnerAccountName = new String(source.OwnerAccountName);
        }
        if (source.OwnerAppId != null) {
            this.OwnerAppId = new Long(source.OwnerAppId);
        }
        if (source.OwnerUin != null) {
            this.OwnerUin = new String(source.OwnerUin);
        }
        if (source.AffectedImageCount != null) {
            this.AffectedImageCount = new Long(source.AffectedImageCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "FirstFoundTime", this.FirstFoundTime);
        this.setParamSimple(map, prefix + "LatestFoundTime", this.LatestFoundTime);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "OwnerAccountName", this.OwnerAccountName);
        this.setParamSimple(map, prefix + "OwnerAppId", this.OwnerAppId);
        this.setParamSimple(map, prefix + "OwnerUin", this.OwnerUin);
        this.setParamSimple(map, prefix + "AffectedImageCount", this.AffectedImageCount);

    }
}

