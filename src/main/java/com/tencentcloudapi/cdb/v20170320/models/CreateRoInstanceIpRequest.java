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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateRoInstanceIpRequest extends AbstractModel{

    /**
    * 只读实例ID，格式如：cdbro-3i70uj0k，与云数据库控制台页面中显示的只读实例ID相同。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 子网描述符，例如：subnet-1typ0s7d。
    */
    @SerializedName("UniqSubnetId")
    @Expose
    private String UniqSubnetId;

    /**
    * vpc描述符，例如：vpc-a23yt67j,如果传了该字段则UniqSubnetId必传
    */
    @SerializedName("UniqVpcId")
    @Expose
    private String UniqVpcId;

    /**
     * Get 只读实例ID，格式如：cdbro-3i70uj0k，与云数据库控制台页面中显示的只读实例ID相同。 
     * @return InstanceId 只读实例ID，格式如：cdbro-3i70uj0k，与云数据库控制台页面中显示的只读实例ID相同。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 只读实例ID，格式如：cdbro-3i70uj0k，与云数据库控制台页面中显示的只读实例ID相同。
     * @param InstanceId 只读实例ID，格式如：cdbro-3i70uj0k，与云数据库控制台页面中显示的只读实例ID相同。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 子网描述符，例如：subnet-1typ0s7d。 
     * @return UniqSubnetId 子网描述符，例如：subnet-1typ0s7d。
     */
    public String getUniqSubnetId() {
        return this.UniqSubnetId;
    }

    /**
     * Set 子网描述符，例如：subnet-1typ0s7d。
     * @param UniqSubnetId 子网描述符，例如：subnet-1typ0s7d。
     */
    public void setUniqSubnetId(String UniqSubnetId) {
        this.UniqSubnetId = UniqSubnetId;
    }

    /**
     * Get vpc描述符，例如：vpc-a23yt67j,如果传了该字段则UniqSubnetId必传 
     * @return UniqVpcId vpc描述符，例如：vpc-a23yt67j,如果传了该字段则UniqSubnetId必传
     */
    public String getUniqVpcId() {
        return this.UniqVpcId;
    }

    /**
     * Set vpc描述符，例如：vpc-a23yt67j,如果传了该字段则UniqSubnetId必传
     * @param UniqVpcId vpc描述符，例如：vpc-a23yt67j,如果传了该字段则UniqSubnetId必传
     */
    public void setUniqVpcId(String UniqVpcId) {
        this.UniqVpcId = UniqVpcId;
    }

    public CreateRoInstanceIpRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateRoInstanceIpRequest(CreateRoInstanceIpRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.UniqSubnetId != null) {
            this.UniqSubnetId = new String(source.UniqSubnetId);
        }
        if (source.UniqVpcId != null) {
            this.UniqVpcId = new String(source.UniqVpcId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "UniqSubnetId", this.UniqSubnetId);
        this.setParamSimple(map, prefix + "UniqVpcId", this.UniqVpcId);

    }
}

