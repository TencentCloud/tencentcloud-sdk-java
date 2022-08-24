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
package com.tencentcloudapi.cme.v20191029.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MediaCastDestinationInfo extends AbstractModel{

    /**
    * 输出源序号。由系统进行分配。
    */
    @SerializedName("Index")
    @Expose
    private Long Index;

    /**
    * 输出源的名称。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 输出直播流地址。支持的直播流类型为 RTMP 和 SRT。
    */
    @SerializedName("PushUrl")
    @Expose
    private String PushUrl;

    /**
     * Get 输出源序号。由系统进行分配。 
     * @return Index 输出源序号。由系统进行分配。
     */
    public Long getIndex() {
        return this.Index;
    }

    /**
     * Set 输出源序号。由系统进行分配。
     * @param Index 输出源序号。由系统进行分配。
     */
    public void setIndex(Long Index) {
        this.Index = Index;
    }

    /**
     * Get 输出源的名称。 
     * @return Name 输出源的名称。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 输出源的名称。
     * @param Name 输出源的名称。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 输出直播流地址。支持的直播流类型为 RTMP 和 SRT。 
     * @return PushUrl 输出直播流地址。支持的直播流类型为 RTMP 和 SRT。
     */
    public String getPushUrl() {
        return this.PushUrl;
    }

    /**
     * Set 输出直播流地址。支持的直播流类型为 RTMP 和 SRT。
     * @param PushUrl 输出直播流地址。支持的直播流类型为 RTMP 和 SRT。
     */
    public void setPushUrl(String PushUrl) {
        this.PushUrl = PushUrl;
    }

    public MediaCastDestinationInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MediaCastDestinationInfo(MediaCastDestinationInfo source) {
        if (source.Index != null) {
            this.Index = new Long(source.Index);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.PushUrl != null) {
            this.PushUrl = new String(source.PushUrl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Index", this.Index);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "PushUrl", this.PushUrl);

    }
}

