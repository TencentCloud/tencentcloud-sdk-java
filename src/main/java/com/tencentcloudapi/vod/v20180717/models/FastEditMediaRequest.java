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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FastEditMediaRequest extends AbstractModel {

    /**
    * 输入的媒体文件信息。最多支持传入100个媒体。
    */
    @SerializedName("FileInfos")
    @Expose
    private FastEditMediaFileInfo [] FileInfos;

    /**
    * ClipMode 用来表示剪辑时间点落在一个 TS 分片中间时，是否包含这个分片。共有两种取值： <li>StartInclusiveEndInclusive：当剪辑起始时间点和结束时间点落在一个分片的中间时，都会包含这个分片；</li> <li>StartInclusiveEndExclusive：当起始时间点落在一个分片的中间时，会包含这个分片；而当结束时间点落在一个分片的中间时，不会包含这个分片。</li> 不填时，默认为 StartInclusiveEndInclusive。
    */
    @SerializedName("ClipMode")
    @Expose
    private String ClipMode;

    /**
    * <b>点播[应用](/document/product/266/14574) ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</b>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
     * Get 输入的媒体文件信息。最多支持传入100个媒体。 
     * @return FileInfos 输入的媒体文件信息。最多支持传入100个媒体。
     */
    public FastEditMediaFileInfo [] getFileInfos() {
        return this.FileInfos;
    }

    /**
     * Set 输入的媒体文件信息。最多支持传入100个媒体。
     * @param FileInfos 输入的媒体文件信息。最多支持传入100个媒体。
     */
    public void setFileInfos(FastEditMediaFileInfo [] FileInfos) {
        this.FileInfos = FileInfos;
    }

    /**
     * Get ClipMode 用来表示剪辑时间点落在一个 TS 分片中间时，是否包含这个分片。共有两种取值： <li>StartInclusiveEndInclusive：当剪辑起始时间点和结束时间点落在一个分片的中间时，都会包含这个分片；</li> <li>StartInclusiveEndExclusive：当起始时间点落在一个分片的中间时，会包含这个分片；而当结束时间点落在一个分片的中间时，不会包含这个分片。</li> 不填时，默认为 StartInclusiveEndInclusive。 
     * @return ClipMode ClipMode 用来表示剪辑时间点落在一个 TS 分片中间时，是否包含这个分片。共有两种取值： <li>StartInclusiveEndInclusive：当剪辑起始时间点和结束时间点落在一个分片的中间时，都会包含这个分片；</li> <li>StartInclusiveEndExclusive：当起始时间点落在一个分片的中间时，会包含这个分片；而当结束时间点落在一个分片的中间时，不会包含这个分片。</li> 不填时，默认为 StartInclusiveEndInclusive。
     */
    public String getClipMode() {
        return this.ClipMode;
    }

    /**
     * Set ClipMode 用来表示剪辑时间点落在一个 TS 分片中间时，是否包含这个分片。共有两种取值： <li>StartInclusiveEndInclusive：当剪辑起始时间点和结束时间点落在一个分片的中间时，都会包含这个分片；</li> <li>StartInclusiveEndExclusive：当起始时间点落在一个分片的中间时，会包含这个分片；而当结束时间点落在一个分片的中间时，不会包含这个分片。</li> 不填时，默认为 StartInclusiveEndInclusive。
     * @param ClipMode ClipMode 用来表示剪辑时间点落在一个 TS 分片中间时，是否包含这个分片。共有两种取值： <li>StartInclusiveEndInclusive：当剪辑起始时间点和结束时间点落在一个分片的中间时，都会包含这个分片；</li> <li>StartInclusiveEndExclusive：当起始时间点落在一个分片的中间时，会包含这个分片；而当结束时间点落在一个分片的中间时，不会包含这个分片。</li> 不填时，默认为 StartInclusiveEndInclusive。
     */
    public void setClipMode(String ClipMode) {
        this.ClipMode = ClipMode;
    }

    /**
     * Get <b>点播[应用](/document/product/266/14574) ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</b> 
     * @return SubAppId <b>点播[应用](/document/product/266/14574) ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</b>
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <b>点播[应用](/document/product/266/14574) ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</b>
     * @param SubAppId <b>点播[应用](/document/product/266/14574) ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</b>
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    public FastEditMediaRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FastEditMediaRequest(FastEditMediaRequest source) {
        if (source.FileInfos != null) {
            this.FileInfos = new FastEditMediaFileInfo[source.FileInfos.length];
            for (int i = 0; i < source.FileInfos.length; i++) {
                this.FileInfos[i] = new FastEditMediaFileInfo(source.FileInfos[i]);
            }
        }
        if (source.ClipMode != null) {
            this.ClipMode = new String(source.ClipMode);
        }
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "FileInfos.", this.FileInfos);
        this.setParamSimple(map, prefix + "ClipMode", this.ClipMode);
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);

    }
}

