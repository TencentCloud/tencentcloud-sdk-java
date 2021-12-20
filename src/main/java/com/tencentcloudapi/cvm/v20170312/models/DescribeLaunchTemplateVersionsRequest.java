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
package com.tencentcloudapi.cvm.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeLaunchTemplateVersionsRequest extends AbstractModel{

    /**
    * 启动模板ID。
    */
    @SerializedName("LaunchTemplateId")
    @Expose
    private String LaunchTemplateId;

    /**
    * 实例启动模板列表。
    */
    @SerializedName("LaunchTemplateVersions")
    @Expose
    private Long [] LaunchTemplateVersions;

    /**
    * 通过范围指定版本时的最小版本号，默认为0。
    */
    @SerializedName("MinVersion")
    @Expose
    private Long MinVersion;

    /**
    * 过范围指定版本时的最大版本号，默认为30。
    */
    @SerializedName("MaxVersion")
    @Expose
    private Long MaxVersion;

    /**
    * 偏移量，默认为0。关于`Offset`的更进一步介绍请参考 API [简介](https://cloud.tencent.com/document/api/213/15688)中的相关小节。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 返回数量，默认为20，最大值为100。关于`Limit`的更进一步介绍请参考 API [简介](https://cloud.tencent.com/document/api/213/15688)中的相关小节。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 是否查询默认版本。该参数不可与LaunchTemplateVersions同时指定。
    */
    @SerializedName("DefaultVersion")
    @Expose
    private Boolean DefaultVersion;

    /**
     * Get 启动模板ID。 
     * @return LaunchTemplateId 启动模板ID。
     */
    public String getLaunchTemplateId() {
        return this.LaunchTemplateId;
    }

    /**
     * Set 启动模板ID。
     * @param LaunchTemplateId 启动模板ID。
     */
    public void setLaunchTemplateId(String LaunchTemplateId) {
        this.LaunchTemplateId = LaunchTemplateId;
    }

    /**
     * Get 实例启动模板列表。 
     * @return LaunchTemplateVersions 实例启动模板列表。
     */
    public Long [] getLaunchTemplateVersions() {
        return this.LaunchTemplateVersions;
    }

    /**
     * Set 实例启动模板列表。
     * @param LaunchTemplateVersions 实例启动模板列表。
     */
    public void setLaunchTemplateVersions(Long [] LaunchTemplateVersions) {
        this.LaunchTemplateVersions = LaunchTemplateVersions;
    }

    /**
     * Get 通过范围指定版本时的最小版本号，默认为0。 
     * @return MinVersion 通过范围指定版本时的最小版本号，默认为0。
     */
    public Long getMinVersion() {
        return this.MinVersion;
    }

    /**
     * Set 通过范围指定版本时的最小版本号，默认为0。
     * @param MinVersion 通过范围指定版本时的最小版本号，默认为0。
     */
    public void setMinVersion(Long MinVersion) {
        this.MinVersion = MinVersion;
    }

    /**
     * Get 过范围指定版本时的最大版本号，默认为30。 
     * @return MaxVersion 过范围指定版本时的最大版本号，默认为30。
     */
    public Long getMaxVersion() {
        return this.MaxVersion;
    }

    /**
     * Set 过范围指定版本时的最大版本号，默认为30。
     * @param MaxVersion 过范围指定版本时的最大版本号，默认为30。
     */
    public void setMaxVersion(Long MaxVersion) {
        this.MaxVersion = MaxVersion;
    }

    /**
     * Get 偏移量，默认为0。关于`Offset`的更进一步介绍请参考 API [简介](https://cloud.tencent.com/document/api/213/15688)中的相关小节。 
     * @return Offset 偏移量，默认为0。关于`Offset`的更进一步介绍请参考 API [简介](https://cloud.tencent.com/document/api/213/15688)中的相关小节。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，默认为0。关于`Offset`的更进一步介绍请参考 API [简介](https://cloud.tencent.com/document/api/213/15688)中的相关小节。
     * @param Offset 偏移量，默认为0。关于`Offset`的更进一步介绍请参考 API [简介](https://cloud.tencent.com/document/api/213/15688)中的相关小节。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 返回数量，默认为20，最大值为100。关于`Limit`的更进一步介绍请参考 API [简介](https://cloud.tencent.com/document/api/213/15688)中的相关小节。 
     * @return Limit 返回数量，默认为20，最大值为100。关于`Limit`的更进一步介绍请参考 API [简介](https://cloud.tencent.com/document/api/213/15688)中的相关小节。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回数量，默认为20，最大值为100。关于`Limit`的更进一步介绍请参考 API [简介](https://cloud.tencent.com/document/api/213/15688)中的相关小节。
     * @param Limit 返回数量，默认为20，最大值为100。关于`Limit`的更进一步介绍请参考 API [简介](https://cloud.tencent.com/document/api/213/15688)中的相关小节。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 是否查询默认版本。该参数不可与LaunchTemplateVersions同时指定。 
     * @return DefaultVersion 是否查询默认版本。该参数不可与LaunchTemplateVersions同时指定。
     */
    public Boolean getDefaultVersion() {
        return this.DefaultVersion;
    }

    /**
     * Set 是否查询默认版本。该参数不可与LaunchTemplateVersions同时指定。
     * @param DefaultVersion 是否查询默认版本。该参数不可与LaunchTemplateVersions同时指定。
     */
    public void setDefaultVersion(Boolean DefaultVersion) {
        this.DefaultVersion = DefaultVersion;
    }

    public DescribeLaunchTemplateVersionsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeLaunchTemplateVersionsRequest(DescribeLaunchTemplateVersionsRequest source) {
        if (source.LaunchTemplateId != null) {
            this.LaunchTemplateId = new String(source.LaunchTemplateId);
        }
        if (source.LaunchTemplateVersions != null) {
            this.LaunchTemplateVersions = new Long[source.LaunchTemplateVersions.length];
            for (int i = 0; i < source.LaunchTemplateVersions.length; i++) {
                this.LaunchTemplateVersions[i] = new Long(source.LaunchTemplateVersions[i]);
            }
        }
        if (source.MinVersion != null) {
            this.MinVersion = new Long(source.MinVersion);
        }
        if (source.MaxVersion != null) {
            this.MaxVersion = new Long(source.MaxVersion);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.DefaultVersion != null) {
            this.DefaultVersion = new Boolean(source.DefaultVersion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LaunchTemplateId", this.LaunchTemplateId);
        this.setParamArraySimple(map, prefix + "LaunchTemplateVersions.", this.LaunchTemplateVersions);
        this.setParamSimple(map, prefix + "MinVersion", this.MinVersion);
        this.setParamSimple(map, prefix + "MaxVersion", this.MaxVersion);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "DefaultVersion", this.DefaultVersion);

    }
}

