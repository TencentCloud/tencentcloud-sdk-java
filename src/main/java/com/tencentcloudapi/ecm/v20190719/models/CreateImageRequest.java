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
package com.tencentcloudapi.ecm.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateImageRequest extends AbstractModel{

    /**
    * 镜像名称。
    */
    @SerializedName("ImageName")
    @Expose
    private String ImageName;

    /**
    * 需要制作镜像的实例ID。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 镜像描述。
    */
    @SerializedName("ImageDescription")
    @Expose
    private String ImageDescription;

    /**
    * 是否执行强制关机以制作镜像。取值范围：
TRUE：表示自动关机后制作镜像
FALSE：表示开机状态制作，目前不支持，需要先手动关机
默认取值：FALSE。
    */
    @SerializedName("ForcePoweroff")
    @Expose
    private String ForcePoweroff;

    /**
     * Get 镜像名称。 
     * @return ImageName 镜像名称。
     */
    public String getImageName() {
        return this.ImageName;
    }

    /**
     * Set 镜像名称。
     * @param ImageName 镜像名称。
     */
    public void setImageName(String ImageName) {
        this.ImageName = ImageName;
    }

    /**
     * Get 需要制作镜像的实例ID。 
     * @return InstanceId 需要制作镜像的实例ID。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 需要制作镜像的实例ID。
     * @param InstanceId 需要制作镜像的实例ID。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 镜像描述。 
     * @return ImageDescription 镜像描述。
     */
    public String getImageDescription() {
        return this.ImageDescription;
    }

    /**
     * Set 镜像描述。
     * @param ImageDescription 镜像描述。
     */
    public void setImageDescription(String ImageDescription) {
        this.ImageDescription = ImageDescription;
    }

    /**
     * Get 是否执行强制关机以制作镜像。取值范围：
TRUE：表示自动关机后制作镜像
FALSE：表示开机状态制作，目前不支持，需要先手动关机
默认取值：FALSE。 
     * @return ForcePoweroff 是否执行强制关机以制作镜像。取值范围：
TRUE：表示自动关机后制作镜像
FALSE：表示开机状态制作，目前不支持，需要先手动关机
默认取值：FALSE。
     */
    public String getForcePoweroff() {
        return this.ForcePoweroff;
    }

    /**
     * Set 是否执行强制关机以制作镜像。取值范围：
TRUE：表示自动关机后制作镜像
FALSE：表示开机状态制作，目前不支持，需要先手动关机
默认取值：FALSE。
     * @param ForcePoweroff 是否执行强制关机以制作镜像。取值范围：
TRUE：表示自动关机后制作镜像
FALSE：表示开机状态制作，目前不支持，需要先手动关机
默认取值：FALSE。
     */
    public void setForcePoweroff(String ForcePoweroff) {
        this.ForcePoweroff = ForcePoweroff;
    }

    public CreateImageRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateImageRequest(CreateImageRequest source) {
        if (source.ImageName != null) {
            this.ImageName = new String(source.ImageName);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ImageDescription != null) {
            this.ImageDescription = new String(source.ImageDescription);
        }
        if (source.ForcePoweroff != null) {
            this.ForcePoweroff = new String(source.ForcePoweroff);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ImageName", this.ImageName);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "ImageDescription", this.ImageDescription);
        this.setParamSimple(map, prefix + "ForcePoweroff", this.ForcePoweroff);

    }
}

