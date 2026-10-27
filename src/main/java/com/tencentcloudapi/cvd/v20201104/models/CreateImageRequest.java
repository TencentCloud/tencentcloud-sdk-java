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
package com.tencentcloudapi.cvd.v20201104.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateImageRequest extends AbstractModel {

    /**
    * <p>云桌面实例ID。</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>镜像名称。只支持中文、字母、数字或连接符号&quot;-&quot;，且最多60个字符。<br>默认值：空。</p>
    */
    @SerializedName("ImageName")
    @Expose
    private String ImageName;

    /**
    * <p>镜像的描述信息。支持英文或中文字符，最多60个字符。<br>默认值：空。</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>基于实例创建整机镜像时，指定包含在镜像里的数据盘ID。</p>
    */
    @SerializedName("DataDiskIds")
    @Expose
    private String [] DataDiskIds;

    /**
     * Get <p>云桌面实例ID。</p> 
     * @return InstanceId <p>云桌面实例ID。</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>云桌面实例ID。</p>
     * @param InstanceId <p>云桌面实例ID。</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>镜像名称。只支持中文、字母、数字或连接符号&quot;-&quot;，且最多60个字符。<br>默认值：空。</p> 
     * @return ImageName <p>镜像名称。只支持中文、字母、数字或连接符号&quot;-&quot;，且最多60个字符。<br>默认值：空。</p>
     */
    public String getImageName() {
        return this.ImageName;
    }

    /**
     * Set <p>镜像名称。只支持中文、字母、数字或连接符号&quot;-&quot;，且最多60个字符。<br>默认值：空。</p>
     * @param ImageName <p>镜像名称。只支持中文、字母、数字或连接符号&quot;-&quot;，且最多60个字符。<br>默认值：空。</p>
     */
    public void setImageName(String ImageName) {
        this.ImageName = ImageName;
    }

    /**
     * Get <p>镜像的描述信息。支持英文或中文字符，最多60个字符。<br>默认值：空。</p> 
     * @return Description <p>镜像的描述信息。支持英文或中文字符，最多60个字符。<br>默认值：空。</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>镜像的描述信息。支持英文或中文字符，最多60个字符。<br>默认值：空。</p>
     * @param Description <p>镜像的描述信息。支持英文或中文字符，最多60个字符。<br>默认值：空。</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>基于实例创建整机镜像时，指定包含在镜像里的数据盘ID。</p> 
     * @return DataDiskIds <p>基于实例创建整机镜像时，指定包含在镜像里的数据盘ID。</p>
     */
    public String [] getDataDiskIds() {
        return this.DataDiskIds;
    }

    /**
     * Set <p>基于实例创建整机镜像时，指定包含在镜像里的数据盘ID。</p>
     * @param DataDiskIds <p>基于实例创建整机镜像时，指定包含在镜像里的数据盘ID。</p>
     */
    public void setDataDiskIds(String [] DataDiskIds) {
        this.DataDiskIds = DataDiskIds;
    }

    public CreateImageRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateImageRequest(CreateImageRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ImageName != null) {
            this.ImageName = new String(source.ImageName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.DataDiskIds != null) {
            this.DataDiskIds = new String[source.DataDiskIds.length];
            for (int i = 0; i < source.DataDiskIds.length; i++) {
                this.DataDiskIds[i] = new String(source.DataDiskIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "ImageName", this.ImageName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamArraySimple(map, prefix + "DataDiskIds.", this.DataDiskIds);

    }
}

