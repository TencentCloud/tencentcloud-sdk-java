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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteUserManagerUserListRequest extends AbstractModel {

    /**
    * <p>集群实例ID</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>集群用户名列表</p>
    */
    @SerializedName("UserNameList")
    @Expose
    private String [] UserNameList;

    /**
    * <p>tke/eks集群id，容器集群传</p>
    */
    @SerializedName("TkeClusterId")
    @Expose
    private String TkeClusterId;

    /**
    * <p>默认空，容器版传&quot;native&quot;</p>
    */
    @SerializedName("DisplayStrategy")
    @Expose
    private String DisplayStrategy;

    /**
    * <p>用户组</p>
    */
    @SerializedName("UserGroupList")
    @Expose
    private UserAndGroup [] UserGroupList;

    /**
    * <p>是否删除家目录，只针对cvm集群</p>
    */
    @SerializedName("DeleteHomeDir")
    @Expose
    private Boolean DeleteHomeDir;

    /**
     * Get <p>集群实例ID</p> 
     * @return InstanceId <p>集群实例ID</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>集群实例ID</p>
     * @param InstanceId <p>集群实例ID</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>集群用户名列表</p> 
     * @return UserNameList <p>集群用户名列表</p>
     */
    public String [] getUserNameList() {
        return this.UserNameList;
    }

    /**
     * Set <p>集群用户名列表</p>
     * @param UserNameList <p>集群用户名列表</p>
     */
    public void setUserNameList(String [] UserNameList) {
        this.UserNameList = UserNameList;
    }

    /**
     * Get <p>tke/eks集群id，容器集群传</p> 
     * @return TkeClusterId <p>tke/eks集群id，容器集群传</p>
     */
    public String getTkeClusterId() {
        return this.TkeClusterId;
    }

    /**
     * Set <p>tke/eks集群id，容器集群传</p>
     * @param TkeClusterId <p>tke/eks集群id，容器集群传</p>
     */
    public void setTkeClusterId(String TkeClusterId) {
        this.TkeClusterId = TkeClusterId;
    }

    /**
     * Get <p>默认空，容器版传&quot;native&quot;</p> 
     * @return DisplayStrategy <p>默认空，容器版传&quot;native&quot;</p>
     */
    public String getDisplayStrategy() {
        return this.DisplayStrategy;
    }

    /**
     * Set <p>默认空，容器版传&quot;native&quot;</p>
     * @param DisplayStrategy <p>默认空，容器版传&quot;native&quot;</p>
     */
    public void setDisplayStrategy(String DisplayStrategy) {
        this.DisplayStrategy = DisplayStrategy;
    }

    /**
     * Get <p>用户组</p> 
     * @return UserGroupList <p>用户组</p>
     */
    public UserAndGroup [] getUserGroupList() {
        return this.UserGroupList;
    }

    /**
     * Set <p>用户组</p>
     * @param UserGroupList <p>用户组</p>
     */
    public void setUserGroupList(UserAndGroup [] UserGroupList) {
        this.UserGroupList = UserGroupList;
    }

    /**
     * Get <p>是否删除家目录，只针对cvm集群</p> 
     * @return DeleteHomeDir <p>是否删除家目录，只针对cvm集群</p>
     */
    public Boolean getDeleteHomeDir() {
        return this.DeleteHomeDir;
    }

    /**
     * Set <p>是否删除家目录，只针对cvm集群</p>
     * @param DeleteHomeDir <p>是否删除家目录，只针对cvm集群</p>
     */
    public void setDeleteHomeDir(Boolean DeleteHomeDir) {
        this.DeleteHomeDir = DeleteHomeDir;
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
        if (source.DeleteHomeDir != null) {
            this.DeleteHomeDir = new Boolean(source.DeleteHomeDir);
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
        this.setParamSimple(map, prefix + "DeleteHomeDir", this.DeleteHomeDir);

    }
}

