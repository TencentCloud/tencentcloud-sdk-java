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

public class ModifyStreamPackageSourceLocationRequest extends AbstractModel {

    /**
    * SourceLocation Id。
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 修改后的名称。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 基准URL。	
    */
    @SerializedName("BaseUrl")
    @Expose
    private String BaseUrl;

    /**
    * 是否开启补片。
    */
    @SerializedName("SegmentDeliverEnable")
    @Expose
    private Boolean SegmentDeliverEnable;

    /**
    * 补片配置。	
    */
    @SerializedName("SegmentDeliverConf")
    @Expose
    private SegmentDeliverInfo SegmentDeliverConf;

    /**
    * 是否开启package分发分片，默认开启。	
    */
    @SerializedName("SegmentDeliverUsePackageEnable")
    @Expose
    private Boolean SegmentDeliverUsePackageEnable;

    /**
     * Get SourceLocation Id。 
     * @return Id SourceLocation Id。
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set SourceLocation Id。
     * @param Id SourceLocation Id。
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 修改后的名称。 
     * @return Name 修改后的名称。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 修改后的名称。
     * @param Name 修改后的名称。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 基准URL。	 
     * @return BaseUrl 基准URL。	
     */
    public String getBaseUrl() {
        return this.BaseUrl;
    }

    /**
     * Set 基准URL。	
     * @param BaseUrl 基准URL。	
     */
    public void setBaseUrl(String BaseUrl) {
        this.BaseUrl = BaseUrl;
    }

    /**
     * Get 是否开启补片。 
     * @return SegmentDeliverEnable 是否开启补片。
     */
    public Boolean getSegmentDeliverEnable() {
        return this.SegmentDeliverEnable;
    }

    /**
     * Set 是否开启补片。
     * @param SegmentDeliverEnable 是否开启补片。
     */
    public void setSegmentDeliverEnable(Boolean SegmentDeliverEnable) {
        this.SegmentDeliverEnable = SegmentDeliverEnable;
    }

    /**
     * Get 补片配置。	 
     * @return SegmentDeliverConf 补片配置。	
     */
    public SegmentDeliverInfo getSegmentDeliverConf() {
        return this.SegmentDeliverConf;
    }

    /**
     * Set 补片配置。	
     * @param SegmentDeliverConf 补片配置。	
     */
    public void setSegmentDeliverConf(SegmentDeliverInfo SegmentDeliverConf) {
        this.SegmentDeliverConf = SegmentDeliverConf;
    }

    /**
     * Get 是否开启package分发分片，默认开启。	 
     * @return SegmentDeliverUsePackageEnable 是否开启package分发分片，默认开启。	
     */
    public Boolean getSegmentDeliverUsePackageEnable() {
        return this.SegmentDeliverUsePackageEnable;
    }

    /**
     * Set 是否开启package分发分片，默认开启。	
     * @param SegmentDeliverUsePackageEnable 是否开启package分发分片，默认开启。	
     */
    public void setSegmentDeliverUsePackageEnable(Boolean SegmentDeliverUsePackageEnable) {
        this.SegmentDeliverUsePackageEnable = SegmentDeliverUsePackageEnable;
    }

    public ModifyStreamPackageSourceLocationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyStreamPackageSourceLocationRequest(ModifyStreamPackageSourceLocationRequest source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
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
        this.setParamSimple(map, prefix + "BaseUrl", this.BaseUrl);
        this.setParamSimple(map, prefix + "SegmentDeliverEnable", this.SegmentDeliverEnable);
        this.setParamObj(map, prefix + "SegmentDeliverConf.", this.SegmentDeliverConf);
        this.setParamSimple(map, prefix + "SegmentDeliverUsePackageEnable", this.SegmentDeliverUsePackageEnable);

    }
}

