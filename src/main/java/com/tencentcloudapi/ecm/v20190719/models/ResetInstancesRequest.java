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

public class ResetInstancesRequest extends AbstractModel{

    /**
    * 待重装的实例ID列表。
    */
    @SerializedName("InstanceIdSet")
    @Expose
    private String [] InstanceIdSet;

    /**
    * 重装使用的镜像ID，若未指定，则使用各个实例当前的镜像进行重装。
    */
    @SerializedName("ImageId")
    @Expose
    private String ImageId;

    /**
    * 密码设置，若未指定，则后续将以站内信的形式通知密码。
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * 是否开启云监控和云镜服务，未指定时默认开启。
    */
    @SerializedName("EnhancedService")
    @Expose
    private EnhancedService EnhancedService;

    /**
     * Get 待重装的实例ID列表。 
     * @return InstanceIdSet 待重装的实例ID列表。
     */
    public String [] getInstanceIdSet() {
        return this.InstanceIdSet;
    }

    /**
     * Set 待重装的实例ID列表。
     * @param InstanceIdSet 待重装的实例ID列表。
     */
    public void setInstanceIdSet(String [] InstanceIdSet) {
        this.InstanceIdSet = InstanceIdSet;
    }

    /**
     * Get 重装使用的镜像ID，若未指定，则使用各个实例当前的镜像进行重装。 
     * @return ImageId 重装使用的镜像ID，若未指定，则使用各个实例当前的镜像进行重装。
     */
    public String getImageId() {
        return this.ImageId;
    }

    /**
     * Set 重装使用的镜像ID，若未指定，则使用各个实例当前的镜像进行重装。
     * @param ImageId 重装使用的镜像ID，若未指定，则使用各个实例当前的镜像进行重装。
     */
    public void setImageId(String ImageId) {
        this.ImageId = ImageId;
    }

    /**
     * Get 密码设置，若未指定，则后续将以站内信的形式通知密码。 
     * @return Password 密码设置，若未指定，则后续将以站内信的形式通知密码。
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set 密码设置，若未指定，则后续将以站内信的形式通知密码。
     * @param Password 密码设置，若未指定，则后续将以站内信的形式通知密码。
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get 是否开启云监控和云镜服务，未指定时默认开启。 
     * @return EnhancedService 是否开启云监控和云镜服务，未指定时默认开启。
     */
    public EnhancedService getEnhancedService() {
        return this.EnhancedService;
    }

    /**
     * Set 是否开启云监控和云镜服务，未指定时默认开启。
     * @param EnhancedService 是否开启云监控和云镜服务，未指定时默认开启。
     */
    public void setEnhancedService(EnhancedService EnhancedService) {
        this.EnhancedService = EnhancedService;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "InstanceIdSet.", this.InstanceIdSet);
        this.setParamSimple(map, prefix + "ImageId", this.ImageId);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamObj(map, prefix + "EnhancedService.", this.EnhancedService);

    }
}

