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
package com.tencentcloudapi.tdai.v20250717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ClawDeployInfo extends AbstractModel {

    /**
    * <p>无</p>
    */
    @SerializedName("UserVpcId")
    @Expose
    private String UserVpcId;

    /**
    * <p>无</p>
    */
    @SerializedName("UserSubnetId")
    @Expose
    private String UserSubnetId;

    /**
    * <p>无</p>
    */
    @SerializedName("UserVpcRegion")
    @Expose
    private String UserVpcRegion;

    /**
     * Get <p>无</p> 
     * @return UserVpcId <p>无</p>
     */
    public String getUserVpcId() {
        return this.UserVpcId;
    }

    /**
     * Set <p>无</p>
     * @param UserVpcId <p>无</p>
     */
    public void setUserVpcId(String UserVpcId) {
        this.UserVpcId = UserVpcId;
    }

    /**
     * Get <p>无</p> 
     * @return UserSubnetId <p>无</p>
     */
    public String getUserSubnetId() {
        return this.UserSubnetId;
    }

    /**
     * Set <p>无</p>
     * @param UserSubnetId <p>无</p>
     */
    public void setUserSubnetId(String UserSubnetId) {
        this.UserSubnetId = UserSubnetId;
    }

    /**
     * Get <p>无</p> 
     * @return UserVpcRegion <p>无</p>
     */
    public String getUserVpcRegion() {
        return this.UserVpcRegion;
    }

    /**
     * Set <p>无</p>
     * @param UserVpcRegion <p>无</p>
     */
    public void setUserVpcRegion(String UserVpcRegion) {
        this.UserVpcRegion = UserVpcRegion;
    }

    public ClawDeployInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClawDeployInfo(ClawDeployInfo source) {
        if (source.UserVpcId != null) {
            this.UserVpcId = new String(source.UserVpcId);
        }
        if (source.UserSubnetId != null) {
            this.UserSubnetId = new String(source.UserSubnetId);
        }
        if (source.UserVpcRegion != null) {
            this.UserVpcRegion = new String(source.UserVpcRegion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserVpcId", this.UserVpcId);
        this.setParamSimple(map, prefix + "UserSubnetId", this.UserSubnetId);
        this.setParamSimple(map, prefix + "UserVpcRegion", this.UserVpcRegion);

    }
}

