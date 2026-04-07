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

public class OutputInfo extends AbstractModel {

    /**
    * HLS DASH。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * output group名称，可以和source的group名称对应关联起来。
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * channel program调度后输出的文件名。
    */
    @SerializedName("ManifestName")
    @Expose
    private String ManifestName;

    /**
    * Type为HLS时manifest配置使用的字段。
    */
    @SerializedName("ManifestConf")
    @Expose
    private ManifestInfo ManifestConf;

    /**
    * 播放地址。
    */
    @SerializedName("PlaybackURL")
    @Expose
    private String PlaybackURL;

    /**
    * Type为DASH时manifest配置使用的字段。
    */
    @SerializedName("DashManifestConf")
    @Expose
    private DashManifestInfo DashManifestConf;

    /**
     * Get HLS DASH。 
     * @return Type HLS DASH。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set HLS DASH。
     * @param Type HLS DASH。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get output group名称，可以和source的group名称对应关联起来。 
     * @return GroupName output group名称，可以和source的group名称对应关联起来。
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set output group名称，可以和source的group名称对应关联起来。
     * @param GroupName output group名称，可以和source的group名称对应关联起来。
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get channel program调度后输出的文件名。 
     * @return ManifestName channel program调度后输出的文件名。
     */
    public String getManifestName() {
        return this.ManifestName;
    }

    /**
     * Set channel program调度后输出的文件名。
     * @param ManifestName channel program调度后输出的文件名。
     */
    public void setManifestName(String ManifestName) {
        this.ManifestName = ManifestName;
    }

    /**
     * Get Type为HLS时manifest配置使用的字段。 
     * @return ManifestConf Type为HLS时manifest配置使用的字段。
     */
    public ManifestInfo getManifestConf() {
        return this.ManifestConf;
    }

    /**
     * Set Type为HLS时manifest配置使用的字段。
     * @param ManifestConf Type为HLS时manifest配置使用的字段。
     */
    public void setManifestConf(ManifestInfo ManifestConf) {
        this.ManifestConf = ManifestConf;
    }

    /**
     * Get 播放地址。 
     * @return PlaybackURL 播放地址。
     */
    public String getPlaybackURL() {
        return this.PlaybackURL;
    }

    /**
     * Set 播放地址。
     * @param PlaybackURL 播放地址。
     */
    public void setPlaybackURL(String PlaybackURL) {
        this.PlaybackURL = PlaybackURL;
    }

    /**
     * Get Type为DASH时manifest配置使用的字段。 
     * @return DashManifestConf Type为DASH时manifest配置使用的字段。
     */
    public DashManifestInfo getDashManifestConf() {
        return this.DashManifestConf;
    }

    /**
     * Set Type为DASH时manifest配置使用的字段。
     * @param DashManifestConf Type为DASH时manifest配置使用的字段。
     */
    public void setDashManifestConf(DashManifestInfo DashManifestConf) {
        this.DashManifestConf = DashManifestConf;
    }

    public OutputInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OutputInfo(OutputInfo source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
        if (source.ManifestName != null) {
            this.ManifestName = new String(source.ManifestName);
        }
        if (source.ManifestConf != null) {
            this.ManifestConf = new ManifestInfo(source.ManifestConf);
        }
        if (source.PlaybackURL != null) {
            this.PlaybackURL = new String(source.PlaybackURL);
        }
        if (source.DashManifestConf != null) {
            this.DashManifestConf = new DashManifestInfo(source.DashManifestConf);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "ManifestName", this.ManifestName);
        this.setParamObj(map, prefix + "ManifestConf.", this.ManifestConf);
        this.setParamSimple(map, prefix + "PlaybackURL", this.PlaybackURL);
        this.setParamObj(map, prefix + "DashManifestConf.", this.DashManifestConf);

    }
}

