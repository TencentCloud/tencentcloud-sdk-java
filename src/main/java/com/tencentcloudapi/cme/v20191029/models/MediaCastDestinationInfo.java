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
    * 输出源 Id。由系统进行分配。
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 输出直播流地址。支持的直播流类型为 RTMP 和 SRT。
    */
    @SerializedName("PushUrl")
    @Expose
    private String PushUrl;

    /**
    * 输出源的名称。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
     * Get 输出源 Id。由系统进行分配。 
     * @return Id 输出源 Id。由系统进行分配。
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 输出源 Id。由系统进行分配。
     * @param Id 输出源 Id。由系统进行分配。
     */
    public void setId(String Id) {
        this.Id = Id;
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

    public MediaCastDestinationInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MediaCastDestinationInfo(MediaCastDestinationInfo source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.PushUrl != null) {
            this.PushUrl = new String(source.PushUrl);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "PushUrl", this.PushUrl);
        this.setParamSimple(map, prefix + "Name", this.Name);

    }
}

