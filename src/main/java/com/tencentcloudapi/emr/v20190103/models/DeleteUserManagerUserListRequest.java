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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteUserManagerUserListRequest extends AbstractModel{

    /**
    * 集群实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 集群用户名列表
    */
    @SerializedName("UserNameList")
    @Expose
    private String [] UserNameList;

    /**
    * tke/eks集群id，容器集群传
    */
    @SerializedName("TkeClusterId")
    @Expose
    private String TkeClusterId;

    /**
    * 默认空，容器版传"native"
    */
    @SerializedName("DisplayStrategy")
    @Expose
    private String DisplayStrategy;

    /**
    * 用户组
    */
    @SerializedName("UserGroupList")
    @Expose
    private UserAndGroup [] UserGroupList;

    /**
     * Get 集群实例ID 
     * @return InstanceId 集群实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 集群实例ID
     * @param InstanceId 集群实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 集群用户名列表 
     * @return UserNameList 集群用户名列表
     */
    public String [] getUserNameList() {
        return this.UserNameList;
    }

    /**
     * Set 集群用户名列表
     * @param UserNameList 集群用户名列表
     */
    public void setUserNameList(String [] UserNameList) {
        this.UserNameList = UserNameList;
    }

    /**
     * Get tke/eks集群id，容器集群传 
     * @return TkeClusterId tke/eks集群id，容器集群传
     */
    public String getTkeClusterId() {
        return this.TkeClusterId;
    }

    /**
     * Set tke/eks集群id，容器集群传
     * @param TkeClusterId tke/eks集群id，容器集群传
     */
    public void setTkeClusterId(String TkeClusterId) {
        this.TkeClusterId = TkeClusterId;
    }

    /**
     * Get 默认空，容器版传"native" 
     * @return DisplayStrategy 默认空，容器版传"native"
     */
    public String getDisplayStrategy() {
        return this.DisplayStrategy;
    }

    /**
     * Set 默认空，容器版传"native"
     * @param DisplayStrategy 默认空，容器版传"native"
     */
    public void setDisplayStrategy(String DisplayStrategy) {
        this.DisplayStrategy = DisplayStrategy;
    }

    /**
     * Get 用户组 
     * @return UserGroupList 用户组
     */
    public UserAndGroup [] getUserGroupList() {
        return this.UserGroupList;
    }

    /**
     * Set 用户组
     * @param UserGroupList 用户组
     */
    public void setUserGroupList(UserAndGroup [] UserGroupList) {
        this.UserGroupList = UserGroupList;
    }

    public DeleteUserManagerUserListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteUserManagerUserListRequest(DeleteUserManagerUserListRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.UserNameList != null) {
            this.UserNameList = new String[source.UserNameList.length];
            for (int i = 0; i < source.UserNameList.length; i++) {
                this.UserNameList[i] = new String(source.UserNameList[i]);
            }
        }
        if (source.TkeClusterId != null) {
            this.TkeClusterId = new String(source.TkeClusterId);
        }
        if (source.DisplayStrategy != null) {
            this.DisplayStrategy = new String(source.DisplayStrategy);
        }
        if (source.UserGroupList != null) {
            this.UserGroupList = new UserAndGroup[source.UserGroupList.length];
            for (int i = 0; i < source.UserGroupList.length; i++) {
                this.UserGroupList[i] = new UserAndGroup(source.UserGroupList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArraySimple(map, prefix + "UserNameList.", this.UserNameList);
        this.setParamSimple(map, prefix + "TkeClusterId", this.TkeClusterId);
        this.setParamSimple(map, prefix + "DisplayStrategy", this.DisplayStrategy);
        this.setParamArrayObj(map, prefix + "UserGroupList.", this.UserGroupList);

    }
}

