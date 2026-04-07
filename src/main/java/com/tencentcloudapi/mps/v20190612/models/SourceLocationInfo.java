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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SourceLocationInfo extends AbstractModel {

    /**
    * <p>ID，唯一标识。</p>
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * <p>SourceLocation名称。</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>地域。</p>
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * <p>BaseUrl信息。</p>
    */
    @SerializedName("BaseUrl")
    @Expose
    private String BaseUrl;

    /**
    * <p>是否开启补片。</p>
    */
    @SerializedName("SegmentDeliverEnable")
    @Expose
    private Boolean SegmentDeliverEnable;

    /**
    * <p>补片配置。</p>
    */
    @SerializedName("SegmentDeliverConf")
    @Expose
    private SegmentDeliverInfo SegmentDeliverConf;

    /**
    * <p>绑定的直播source id列表。</p>
    */
    @SerializedName("AttachedLiveSources")
    @Expose
    private String [] AttachedLiveSources;

    /**
    * <p>绑定的点播source id列表。</p>
    */
    @SerializedName("AttachedVodSources")
    @Expose
    private String [] AttachedVodSources;

    /**
    * <p>source location创建时间，Unix时间戳。</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * <p>source location最近一次修改时间，Unix时间戳。</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
    * <p>是否开启package分发分片，默认开启。</p>
    */
    @SerializedName("SegmentDeliverUsePackageEnable")
    @Expose
    private Boolean SegmentDeliverUsePackageEnable;

    /**
     * Get <p>ID，唯一标识。</p> 
     * @return Id <p>ID，唯一标识。</p>
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set <p>ID，唯一标识。</p>
     * @param Id <p>ID，唯一标识。</p>
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get <p>SourceLocation名称。</p> 
     * @return Name <p>SourceLocation名称。</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>SourceLocation名称。</p>
     * @param Name <p>SourceLocation名称。</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>地域。</p> 
     * @return Region <p>地域。</p>
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set <p>地域。</p>
     * @param Region <p>地域。</p>
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get <p>BaseUrl信息。</p> 
     * @return BaseUrl <p>BaseUrl信息。</p>
     */
    public String getBaseUrl() {
        return this.BaseUrl;
    }

    /**
     * Set <p>BaseUrl信息。</p>
     * @param BaseUrl <p>BaseUrl信息。</p>
     */
    public void setBaseUrl(String BaseUrl) {
        this.BaseUrl = BaseUrl;
    }

    /**
     * Get <p>是否开启补片。</p> 
     * @return SegmentDeliverEnable <p>是否开启补片。</p>
     */
    public Boolean getSegmentDeliverEnable() {
        return this.SegmentDeliverEnable;
    }

    /**
     * Set <p>是否开启补片。</p>
     * @param SegmentDeliverEnable <p>是否开启补片。</p>
     */
    public void setSegmentDeliverEnable(Boolean SegmentDeliverEnable) {
        this.SegmentDeliverEnable = SegmentDeliverEnable;
    }

    /**
     * Get <p>补片配置。</p> 
     * @return SegmentDeliverConf <p>补片配置。</p>
     */
    public SegmentDeliverInfo getSegmentDeliverConf() {
        return this.SegmentDeliverConf;
    }

    /**
     * Set <p>补片配置。</p>
     * @param SegmentDeliverConf <p>补片配置。</p>
     */
    public void setSegmentDeliverConf(SegmentDeliverInfo SegmentDeliverConf) {
        this.SegmentDeliverConf = SegmentDeliverConf;
    }

    /**
     * Get <p>绑定的直播source id列表。</p> 
     * @return AttachedLiveSources <p>绑定的直播source id列表。</p>
     */
    public String [] getAttachedLiveSources() {
        return this.AttachedLiveSources;
    }

    /**
     * Set <p>绑定的直播source id列表。</p>
     * @param AttachedLiveSources <p>绑定的直播source id列表。</p>
     */
    public void setAttachedLiveSources(String [] AttachedLiveSources) {
        this.AttachedLiveSources = AttachedLiveSources;
    }

    /**
     * Get <p>绑定的点播source id列表。</p> 
     * @return AttachedVodSources <p>绑定的点播source id列表。</p>
     */
    public String [] getAttachedVodSources() {
        return this.AttachedVodSources;
    }

    /**
     * Set <p>绑定的点播source id列表。</p>
     * @param AttachedVodSources <p>绑定的点播source id列表。</p>
     */
    public void setAttachedVodSources(String [] AttachedVodSources) {
        this.AttachedVodSources = AttachedVodSources;
    }

    /**
     * Get <p>source location创建时间，Unix时间戳。</p> 
     * @return CreateTime <p>source location创建时间，Unix时间戳。</p>
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>source location创建时间，Unix时间戳。</p>
     * @param CreateTime <p>source location创建时间，Unix时间戳。</p>
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>source location最近一次修改时间，Unix时间戳。</p> 
     * @return UpdateTime <p>source location最近一次修改时间，Unix时间戳。</p>
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>source location最近一次修改时间，Unix时间戳。</p>
     * @param UpdateTime <p>source location最近一次修改时间，Unix时间戳。</p>
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get <p>是否开启package分发分片，默认开启。</p> 
     * @return SegmentDeliverUsePackageEnable <p>是否开启package分发分片，默认开启。</p>
     */
    public Boolean getSegmentDeliverUsePackageEnable() {
        return this.SegmentDeliverUsePackageEnable;
    }

    /**
     * Set <p>是否开启package分发分片，默认开启。</p>
     * @param SegmentDeliverUsePackageEnable <p>是否开启package分发分片，默认开启。</p>
     */
    public void setSegmentDeliverUsePackageEnable(Boolean SegmentDeliverUsePackageEnable) {
        this.SegmentDeliverUsePackageEnable = SegmentDeliverUsePackageEnable;
    }

    public SourceLocationInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SourceLocationInfo(SourceLocationInfo source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.BaseUrl != null) {
            this.BaseUrl = new String(source.BaseUrl);
        }
        if (source.SegmentDeliverEnable != null) {
            this.SegmentDeliverEnable = new Boolean(source.SegmentDeliverEnable);
        }
        if (source.SegmentDeliverConf != null) {
            this.SegmentDeliverConf = new SegmentDeliverInfo(source.SegmentDeliverConf);
        }
        if (source.AttachedLiveSources != null) {
            this.AttachedLiveSources = new String[source.AttachedLiveSources.length];
            for (int i = 0; i < source.AttachedLiveSources.length; i++) {
                this.AttachedLiveSources[i] = new String(source.AttachedLiveSources[i]);
            }
        }
        if (source.AttachedVodSources != null) {
            this.AttachedVodSources = new String[source.AttachedVodSources.length];
            for (int i = 0; i < source.AttachedVodSources.length; i++) {
                this.AttachedVodSources[i] = new String(source.AttachedVodSources[i]);
            }
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new Long(source.UpdateTime);
        }
        if (source.SegmentDeliverUsePackageEnable != null) {
            this.SegmentDeliverUsePackageEnable = new Boolean(source.SegmentDeliverUsePackageEnable);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "BaseUrl", this.BaseUrl);
        this.setParamSimple(map, prefix + "SegmentDeliverEnable", this.SegmentDeliverEnable);
        this.setParamObj(map, prefix + "SegmentDeliverConf.", this.SegmentDeliverConf);
        this.setParamArraySimple(map, prefix + "AttachedLiveSources.", this.AttachedLiveSources);
        this.setParamArraySimple(map, prefix + "AttachedVodSources.", this.AttachedVodSources);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "SegmentDeliverUsePackageEnable", this.SegmentDeliverUsePackageEnable);

    }
}

