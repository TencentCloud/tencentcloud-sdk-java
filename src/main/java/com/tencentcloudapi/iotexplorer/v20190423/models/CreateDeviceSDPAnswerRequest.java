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
package com.tencentcloudapi.iotexplorer.v20190423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateDeviceSDPAnswerRequest extends AbstractModel {

    /**
    * <p>产品ID</p>
    */
    @SerializedName("ProductId")
    @Expose
    private String ProductId;

    /**
    * <p>设备名称</p>
    */
    @SerializedName("DeviceName")
    @Expose
    private String DeviceName;

    /**
    * <p>SDP提议</p>
    */
    @SerializedName("SDPOffer")
    @Expose
    private String SDPOffer;

    /**
    * <p>客户自定义拉流标识</p>
    */
    @SerializedName("RequesterTag")
    @Expose
    private String RequesterTag;

    /**
    * <p>默认值：0，如果需要webrtc推流拉流在同一个SDP中，需要值为1，常用于单PC模式</p><p>枚举值：</p><ul><li>0： 默认值，传统多pc推流模式</li><li>1： 单pc模式，如果需要webrtc单pc推拉流，采用此模式，此模式下注意SDP需要包含推拉流全部信息</li></ul><p>默认值：0</p>
    */
    @SerializedName("EnableSubPub")
    @Expose
    private Long EnableSubPub;

    /**
     * Get <p>产品ID</p> 
     * @return ProductId <p>产品ID</p>
     */
    public String getProductId() {
        return this.ProductId;
    }

    /**
     * Set <p>产品ID</p>
     * @param ProductId <p>产品ID</p>
     */
    public void setProductId(String ProductId) {
        this.ProductId = ProductId;
    }

    /**
     * Get <p>设备名称</p> 
     * @return DeviceName <p>设备名称</p>
     */
    public String getDeviceName() {
        return this.DeviceName;
    }

    /**
     * Set <p>设备名称</p>
     * @param DeviceName <p>设备名称</p>
     */
    public void setDeviceName(String DeviceName) {
        this.DeviceName = DeviceName;
    }

    /**
     * Get <p>SDP提议</p> 
     * @return SDPOffer <p>SDP提议</p>
     */
    public String getSDPOffer() {
        return this.SDPOffer;
    }

    /**
     * Set <p>SDP提议</p>
     * @param SDPOffer <p>SDP提议</p>
     */
    public void setSDPOffer(String SDPOffer) {
        this.SDPOffer = SDPOffer;
    }

    /**
     * Get <p>客户自定义拉流标识</p> 
     * @return RequesterTag <p>客户自定义拉流标识</p>
     */
    public String getRequesterTag() {
        return this.RequesterTag;
    }

    /**
     * Set <p>客户自定义拉流标识</p>
     * @param RequesterTag <p>客户自定义拉流标识</p>
     */
    public void setRequesterTag(String RequesterTag) {
        this.RequesterTag = RequesterTag;
    }

    /**
     * Get <p>默认值：0，如果需要webrtc推流拉流在同一个SDP中，需要值为1，常用于单PC模式</p><p>枚举值：</p><ul><li>0： 默认值，传统多pc推流模式</li><li>1： 单pc模式，如果需要webrtc单pc推拉流，采用此模式，此模式下注意SDP需要包含推拉流全部信息</li></ul><p>默认值：0</p> 
     * @return EnableSubPub <p>默认值：0，如果需要webrtc推流拉流在同一个SDP中，需要值为1，常用于单PC模式</p><p>枚举值：</p><ul><li>0： 默认值，传统多pc推流模式</li><li>1： 单pc模式，如果需要webrtc单pc推拉流，采用此模式，此模式下注意SDP需要包含推拉流全部信息</li></ul><p>默认值：0</p>
     */
    public Long getEnableSubPub() {
        return this.EnableSubPub;
    }

    /**
     * Set <p>默认值：0，如果需要webrtc推流拉流在同一个SDP中，需要值为1，常用于单PC模式</p><p>枚举值：</p><ul><li>0： 默认值，传统多pc推流模式</li><li>1： 单pc模式，如果需要webrtc单pc推拉流，采用此模式，此模式下注意SDP需要包含推拉流全部信息</li></ul><p>默认值：0</p>
     * @param EnableSubPub <p>默认值：0，如果需要webrtc推流拉流在同一个SDP中，需要值为1，常用于单PC模式</p><p>枚举值：</p><ul><li>0： 默认值，传统多pc推流模式</li><li>1： 单pc模式，如果需要webrtc单pc推拉流，采用此模式，此模式下注意SDP需要包含推拉流全部信息</li></ul><p>默认值：0</p>
     */
    public void setEnableSubPub(Long EnableSubPub) {
        this.EnableSubPub = EnableSubPub;
    }

    public CreateDeviceSDPAnswerRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateDeviceSDPAnswerRequest(CreateDeviceSDPAnswerRequest source) {
        if (source.ProductId != null) {
            this.ProductId = new String(source.ProductId);
        }
        if (source.DeviceName != null) {
            this.DeviceName = new String(source.DeviceName);
        }
        if (source.SDPOffer != null) {
            this.SDPOffer = new String(source.SDPOffer);
        }
        if (source.RequesterTag != null) {
            this.RequesterTag = new String(source.RequesterTag);
        }
        if (source.EnableSubPub != null) {
            this.EnableSubPub = new Long(source.EnableSubPub);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamSimple(map, prefix + "DeviceName", this.DeviceName);
        this.setParamSimple(map, prefix + "SDPOffer", this.SDPOffer);
        this.setParamSimple(map, prefix + "RequesterTag", this.RequesterTag);
        this.setParamSimple(map, prefix + "EnableSubPub", this.EnableSubPub);

    }
}

