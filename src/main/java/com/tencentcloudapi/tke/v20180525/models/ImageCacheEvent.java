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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ImageCacheEvent extends AbstractModel{

    /**
    * 镜像缓存Id
    */
    @SerializedName("ImageCacheId")
    @Expose
    private String ImageCacheId;

    /**
    * 事件类型, Normal或者Warning
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 事件原因简述
    */
    @SerializedName("Reason")
    @Expose
    private String Reason;

    /**
    * 事件原因详述
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * 事件第一次出现时间
    */
    @SerializedName("FirstTimestamp")
    @Expose
    private String FirstTimestamp;

    /**
    * 事件最后一次出现时间
    */
    @SerializedName("LastTimestamp")
    @Expose
    private String LastTimestamp;

    /**
     * Get 镜像缓存Id 
     * @return ImageCacheId 镜像缓存Id
     */
    public String getImageCacheId() {
        return this.ImageCacheId;
    }

    /**
     * Set 镜像缓存Id
     * @param ImageCacheId 镜像缓存Id
     */
    public void setImageCacheId(String ImageCacheId) {
        this.ImageCacheId = ImageCacheId;
    }

    /**
     * Get 事件类型, Normal或者Warning 
     * @return Type 事件类型, Normal或者Warning
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 事件类型, Normal或者Warning
     * @param Type 事件类型, Normal或者Warning
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 事件原因简述 
     * @return Reason 事件原因简述
     */
    public String getReason() {
        return this.Reason;
    }

    /**
     * Set 事件原因简述
     * @param Reason 事件原因简述
     */
    public void setReason(String Reason) {
        this.Reason = Reason;
    }

    /**
     * Get 事件原因详述 
     * @return Message 事件原因详述
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set 事件原因详述
     * @param Message 事件原因详述
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get 事件第一次出现时间 
     * @return FirstTimestamp 事件第一次出现时间
     */
    public String getFirstTimestamp() {
        return this.FirstTimestamp;
    }

    /**
     * Set 事件第一次出现时间
     * @param FirstTimestamp 事件第一次出现时间
     */
    public void setFirstTimestamp(String FirstTimestamp) {
        this.FirstTimestamp = FirstTimestamp;
    }

    /**
     * Get 事件最后一次出现时间 
     * @return LastTimestamp 事件最后一次出现时间
     */
    public String getLastTimestamp() {
        return this.LastTimestamp;
    }

    /**
     * Set 事件最后一次出现时间
     * @param LastTimestamp 事件最后一次出现时间
     */
    public void setLastTimestamp(String LastTimestamp) {
        this.LastTimestamp = LastTimestamp;
    }

    public ImageCacheEvent() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageCacheEvent(ImageCacheEvent source) {
        if (source.ImageCacheId != null) {
            this.ImageCacheId = new String(source.ImageCacheId);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Reason != null) {
            this.Reason = new String(source.Reason);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
        if (source.FirstTimestamp != null) {
            this.FirstTimestamp = new String(source.FirstTimestamp);
        }
        if (source.LastTimestamp != null) {
            this.LastTimestamp = new String(source.LastTimestamp);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ImageCacheId", this.ImageCacheId);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Reason", this.Reason);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamSimple(map, prefix + "FirstTimestamp", this.FirstTimestamp);
        this.setParamSimple(map, prefix + "LastTimestamp", this.LastTimestamp);

    }
}

