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
package com.tencentcloudapi.batch.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Instance extends AbstractModel {

    /**
    * 实例ID，可通过调用接口[DescribeInstances](https://cloud.tencent.com/document/product/213/15728)获取。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 镜像ID，可通过调用接口[DescribeImages](https://cloud.tencent.com/document/product/213/15715)获取。
    */
    @SerializedName("ImageId")
    @Expose
    private String ImageId;

    /**
    * 实例登录设置。
    */
    @SerializedName("LoginSettings")
    @Expose
    private LoginSettings LoginSettings;

    /**
     * Get 实例ID，可通过调用接口[DescribeInstances](https://cloud.tencent.com/document/product/213/15728)获取。 
     * @return InstanceId 实例ID，可通过调用接口[DescribeInstances](https://cloud.tencent.com/document/product/213/15728)获取。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID，可通过调用接口[DescribeInstances](https://cloud.tencent.com/document/product/213/15728)获取。
     * @param InstanceId 实例ID，可通过调用接口[DescribeInstances](https://cloud.tencent.com/document/product/213/15728)获取。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 镜像ID，可通过调用接口[DescribeImages](https://cloud.tencent.com/document/product/213/15715)获取。 
     * @return ImageId 镜像ID，可通过调用接口[DescribeImages](https://cloud.tencent.com/document/product/213/15715)获取。
     */
    public String getImageId() {
        return this.ImageId;
    }

    /**
     * Set 镜像ID，可通过调用接口[DescribeImages](https://cloud.tencent.com/document/product/213/15715)获取。
     * @param ImageId 镜像ID，可通过调用接口[DescribeImages](https://cloud.tencent.com/document/product/213/15715)获取。
     */
    public void setImageId(String ImageId) {
        this.ImageId = ImageId;
    }

    /**
     * Get 实例登录设置。 
     * @return LoginSettings 实例登录设置。
     */
    public LoginSettings getLoginSettings() {
        return this.LoginSettings;
    }

    /**
     * Set 实例登录设置。
     * @param LoginSettings 实例登录设置。
     */
    public void setLoginSettings(LoginSettings LoginSettings) {
        this.LoginSettings = LoginSettings;
    }

    public Instance() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Instance(Instance source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ImageId != null) {
            this.ImageId = new String(source.ImageId);
        }
        if (source.LoginSettings != null) {
            this.LoginSettings = new LoginSettings(source.LoginSettings);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "ImageId", this.ImageId);
        this.setParamObj(map, prefix + "LoginSettings.", this.LoginSettings);

    }
}

