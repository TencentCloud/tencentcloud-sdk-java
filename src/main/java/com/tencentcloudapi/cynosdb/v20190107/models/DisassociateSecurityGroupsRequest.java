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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DisassociateSecurityGroupsRequest extends AbstractModel {

    /**
    * 实例组 ID 数组，cynosdbmysql-grp-前缀开头或集群 ID。
说明：要获取集群的实例组 ID，可通过 [查询集群实例组](https://cloud.tencent.com/document/product/1003/103934) 进行。
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * 要修改的安全组ID列表，一个或者多个安全组ID组成的数组。
    */
    @SerializedName("SecurityGroupIds")
    @Expose
    private String [] SecurityGroupIds;

    /**
    * 可用区。
说明：请正确输入集群所在的主可用区，若输入非集群所在的主可用区可能显示调用成功，但实际执行会失败。
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
     * Get 实例组 ID 数组，cynosdbmysql-grp-前缀开头或集群 ID。
说明：要获取集群的实例组 ID，可通过 [查询集群实例组](https://cloud.tencent.com/document/product/1003/103934) 进行。 
     * @return InstanceIds 实例组 ID 数组，cynosdbmysql-grp-前缀开头或集群 ID。
说明：要获取集群的实例组 ID，可通过 [查询集群实例组](https://cloud.tencent.com/document/product/1003/103934) 进行。
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set 实例组 ID 数组，cynosdbmysql-grp-前缀开头或集群 ID。
说明：要获取集群的实例组 ID，可通过 [查询集群实例组](https://cloud.tencent.com/document/product/1003/103934) 进行。
     * @param InstanceIds 实例组 ID 数组，cynosdbmysql-grp-前缀开头或集群 ID。
说明：要获取集群的实例组 ID，可通过 [查询集群实例组](https://cloud.tencent.com/document/product/1003/103934) 进行。
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get 要修改的安全组ID列表，一个或者多个安全组ID组成的数组。 
     * @return SecurityGroupIds 要修改的安全组ID列表，一个或者多个安全组ID组成的数组。
     */
    public String [] getSecurityGroupIds() {
        return this.SecurityGroupIds;
    }

    /**
     * Set 要修改的安全组ID列表，一个或者多个安全组ID组成的数组。
     * @param SecurityGroupIds 要修改的安全组ID列表，一个或者多个安全组ID组成的数组。
     */
    public void setSecurityGroupIds(String [] SecurityGroupIds) {
        this.SecurityGroupIds = SecurityGroupIds;
    }

    /**
     * Get 可用区。
说明：请正确输入集群所在的主可用区，若输入非集群所在的主可用区可能显示调用成功，但实际执行会失败。 
     * @return Zone 可用区。
说明：请正确输入集群所在的主可用区，若输入非集群所在的主可用区可能显示调用成功，但实际执行会失败。
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 可用区。
说明：请正确输入集群所在的主可用区，若输入非集群所在的主可用区可能显示调用成功，但实际执行会失败。
     * @param Zone 可用区。
说明：请正确输入集群所在的主可用区，若输入非集群所在的主可用区可能显示调用成功，但实际执行会失败。
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    public DisassociateSecurityGroupsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DisassociateSecurityGroupsRequest(DisassociateSecurityGroupsRequest source) {
        if (source.InstanceIds != null) {
            this.InstanceIds = new String[source.InstanceIds.length];
            for (int i = 0; i < source.InstanceIds.length; i++) {
                this.InstanceIds[i] = new String(source.InstanceIds[i]);
            }
        }
        if (source.SecurityGroupIds != null) {
            this.SecurityGroupIds = new String[source.SecurityGroupIds.length];
            for (int i = 0; i < source.SecurityGroupIds.length; i++) {
                this.SecurityGroupIds[i] = new String(source.SecurityGroupIds[i]);
            }
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamArraySimple(map, prefix + "SecurityGroupIds.", this.SecurityGroupIds);
        this.setParamSimple(map, prefix + "Zone", this.Zone);

    }
}

