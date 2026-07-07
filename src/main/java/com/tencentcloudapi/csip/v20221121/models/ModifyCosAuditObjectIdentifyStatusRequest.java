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

public class ModifyCosAuditObjectIdentifyStatusRequest extends AbstractModel {

    /**
    * <p>资源id</p>
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * <p>文本识别状态</p>
    */
    @SerializedName("TextIdentifyStatus")
    @Expose
    private Long TextIdentifyStatus;

    /**
    * <p>图片识别状态</p>
    */
    @SerializedName("ImageIdentifyStatus")
    @Expose
    private Long ImageIdentifyStatus;

    /**
     * Get <p>资源id</p> 
     * @return ResourceId <p>资源id</p>
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set <p>资源id</p>
     * @param ResourceId <p>资源id</p>
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get <p>文本识别状态</p> 
     * @return TextIdentifyStatus <p>文本识别状态</p>
     */
    public Long getTextIdentifyStatus() {
        return this.TextIdentifyStatus;
    }

    /**
     * Set <p>文本识别状态</p>
     * @param TextIdentifyStatus <p>文本识别状态</p>
     */
    public void setTextIdentifyStatus(Long TextIdentifyStatus) {
        this.TextIdentifyStatus = TextIdentifyStatus;
    }

    /**
     * Get <p>图片识别状态</p> 
     * @return ImageIdentifyStatus <p>图片识别状态</p>
     */
    public Long getImageIdentifyStatus() {
        return this.ImageIdentifyStatus;
    }

    /**
     * Set <p>图片识别状态</p>
     * @param ImageIdentifyStatus <p>图片识别状态</p>
     */
    public void setImageIdentifyStatus(Long ImageIdentifyStatus) {
        this.ImageIdentifyStatus = ImageIdentifyStatus;
    }

    public ModifyCosAuditObjectIdentifyStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyCosAuditObjectIdentifyStatusRequest(ModifyCosAuditObjectIdentifyStatusRequest source) {
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.TextIdentifyStatus != null) {
            this.TextIdentifyStatus = new Long(source.TextIdentifyStatus);
        }
        if (source.ImageIdentifyStatus != null) {
            this.ImageIdentifyStatus = new Long(source.ImageIdentifyStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "TextIdentifyStatus", this.TextIdentifyStatus);
        this.setParamSimple(map, prefix + "ImageIdentifyStatus", this.ImageIdentifyStatus);

    }
}

