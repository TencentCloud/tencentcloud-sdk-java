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

public class DescribeUsersForUserManagerRequest extends AbstractModel{

    /**
    * 集群实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 页码
    */
    @SerializedName("PageNo")
    @Expose
    private Long PageNo;

    /**
    * 分页的大小
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 查询用户列表过滤器
    */
    @SerializedName("UserManagerFilter")
    @Expose
    private UserManagerFilter UserManagerFilter;

    /**
    * 是否需要keytab文件的信息，仅对开启kerberos的集群有效，默认为false
    */
    @SerializedName("NeedKeytabInfo")
    @Expose
    private Boolean NeedKeytabInfo;

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
     * Get 页码 
     * @return PageNo 页码
     */
    public Long getPageNo() {
        return this.PageNo;
    }

    /**
     * Set 页码
     * @param PageNo 页码
     */
    public void setPageNo(Long PageNo) {
        this.PageNo = PageNo;
    }

    /**
     * Get 分页的大小 
     * @return PageSize 分页的大小
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 分页的大小
     * @param PageSize 分页的大小
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 查询用户列表过滤器 
     * @return UserManagerFilter 查询用户列表过滤器
     */
    public UserManagerFilter getUserManagerFilter() {
        return this.UserManagerFilter;
    }

    /**
     * Set 查询用户列表过滤器
     * @param UserManagerFilter 查询用户列表过滤器
     */
    public void setUserManagerFilter(UserManagerFilter UserManagerFilter) {
        this.UserManagerFilter = UserManagerFilter;
    }

    /**
     * Get 是否需要keytab文件的信息，仅对开启kerberos的集群有效，默认为false 
     * @return NeedKeytabInfo 是否需要keytab文件的信息，仅对开启kerberos的集群有效，默认为false
     */
    public Boolean getNeedKeytabInfo() {
        return this.NeedKeytabInfo;
    }

    /**
     * Set 是否需要keytab文件的信息，仅对开启kerberos的集群有效，默认为false
     * @param NeedKeytabInfo 是否需要keytab文件的信息，仅对开启kerberos的集群有效，默认为false
     */
    public void setNeedKeytabInfo(Boolean NeedKeytabInfo) {
        this.NeedKeytabInfo = NeedKeytabInfo;
    }

    public DescribeUsersForUserManagerRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeUsersForUserManagerRequest(DescribeUsersForUserManagerRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.PageNo != null) {
            this.PageNo = new Long(source.PageNo);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.UserManagerFilter != null) {
            this.UserManagerFilter = new UserManagerFilter(source.UserManagerFilter);
        }
        if (source.NeedKeytabInfo != null) {
            this.NeedKeytabInfo = new Boolean(source.NeedKeytabInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "PageNo", this.PageNo);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamObj(map, prefix + "UserManagerFilter.", this.UserManagerFilter);
        this.setParamSimple(map, prefix + "NeedKeytabInfo", this.NeedKeytabInfo);

    }
}

