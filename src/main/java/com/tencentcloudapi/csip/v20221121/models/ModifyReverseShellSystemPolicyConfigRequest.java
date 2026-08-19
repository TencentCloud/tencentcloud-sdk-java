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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyReverseShellSystemPolicyConfigRequest extends AbstractModel {

    /**
    * <p>集团账号的成员id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * <p>内网告警展示</p>
    */
    @SerializedName("InnerNetAlarmShow")
    @Expose
    private Boolean InnerNetAlarmShow;

    /**
    * <p>内网ip展示</p>
    */
    @SerializedName("InnerIPShow")
    @Expose
    private Boolean InnerIPShow;

    /**
    * <p>主机范围：0-指定 1-全部 2-专业版 3-旗舰版 4-专业+旗舰</p>
    */
    @SerializedName("CWPScope")
    @Expose
    private Long CWPScope;

    /**
    * <p>指定主机列表（CWPScope=0时使用）</p>
    */
    @SerializedName("InstanceIDsWithAppId")
    @Expose
    private InstanceIDWithAppIdItem [] InstanceIDsWithAppId;

    /**
    * <p>排除主机列表</p>
    */
    @SerializedName("ExcludeInstanceIDsWithAppId")
    @Expose
    private InstanceIDWithAppIdItem [] ExcludeInstanceIDsWithAppId;

    /**
    * <p>标签ID列表</p>
    */
    @SerializedName("TagIDs")
    @Expose
    private String [] TagIDs;

    /**
    * <p>容器范围：0-指定集群 1-全部集群</p>
    */
    @SerializedName("TCSSScope")
    @Expose
    private Long TCSSScope;

    /**
    * <p>指定集群列表（TCSSScope=0时使用）</p>
    */
    @SerializedName("ClusterIDsWithAppId")
    @Expose
    private ClusterIDWithAppIdItem [] ClusterIDsWithAppId;

    /**
    * <p>排除集群列表</p>
    */
    @SerializedName("ExcludeClusterIDsWithAppId")
    @Expose
    private ClusterIDWithAppIdItem [] ExcludeClusterIDsWithAppId;

    /**
     * Get <p>集团账号的成员id</p> 
     * @return MemberId <p>集团账号的成员id</p>
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set <p>集团账号的成员id</p>
     * @param MemberId <p>集团账号的成员id</p>
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    /**
     * Get <p>内网告警展示</p> 
     * @return InnerNetAlarmShow <p>内网告警展示</p>
     */
    public Boolean getInnerNetAlarmShow() {
        return this.InnerNetAlarmShow;
    }

    /**
     * Set <p>内网告警展示</p>
     * @param InnerNetAlarmShow <p>内网告警展示</p>
     */
    public void setInnerNetAlarmShow(Boolean InnerNetAlarmShow) {
        this.InnerNetAlarmShow = InnerNetAlarmShow;
    }

    /**
     * Get <p>内网ip展示</p> 
     * @return InnerIPShow <p>内网ip展示</p>
     */
    public Boolean getInnerIPShow() {
        return this.InnerIPShow;
    }

    /**
     * Set <p>内网ip展示</p>
     * @param InnerIPShow <p>内网ip展示</p>
     */
    public void setInnerIPShow(Boolean InnerIPShow) {
        this.InnerIPShow = InnerIPShow;
    }

    /**
     * Get <p>主机范围：0-指定 1-全部 2-专业版 3-旗舰版 4-专业+旗舰</p> 
     * @return CWPScope <p>主机范围：0-指定 1-全部 2-专业版 3-旗舰版 4-专业+旗舰</p>
     */
    public Long getCWPScope() {
        return this.CWPScope;
    }

    /**
     * Set <p>主机范围：0-指定 1-全部 2-专业版 3-旗舰版 4-专业+旗舰</p>
     * @param CWPScope <p>主机范围：0-指定 1-全部 2-专业版 3-旗舰版 4-专业+旗舰</p>
     */
    public void setCWPScope(Long CWPScope) {
        this.CWPScope = CWPScope;
    }

    /**
     * Get <p>指定主机列表（CWPScope=0时使用）</p> 
     * @return InstanceIDsWithAppId <p>指定主机列表（CWPScope=0时使用）</p>
     */
    public InstanceIDWithAppIdItem [] getInstanceIDsWithAppId() {
        return this.InstanceIDsWithAppId;
    }

    /**
     * Set <p>指定主机列表（CWPScope=0时使用）</p>
     * @param InstanceIDsWithAppId <p>指定主机列表（CWPScope=0时使用）</p>
     */
    public void setInstanceIDsWithAppId(InstanceIDWithAppIdItem [] InstanceIDsWithAppId) {
        this.InstanceIDsWithAppId = InstanceIDsWithAppId;
    }

    /**
     * Get <p>排除主机列表</p> 
     * @return ExcludeInstanceIDsWithAppId <p>排除主机列表</p>
     */
    public InstanceIDWithAppIdItem [] getExcludeInstanceIDsWithAppId() {
        return this.ExcludeInstanceIDsWithAppId;
    }

    /**
     * Set <p>排除主机列表</p>
     * @param ExcludeInstanceIDsWithAppId <p>排除主机列表</p>
     */
    public void setExcludeInstanceIDsWithAppId(InstanceIDWithAppIdItem [] ExcludeInstanceIDsWithAppId) {
        this.ExcludeInstanceIDsWithAppId = ExcludeInstanceIDsWithAppId;
    }

    /**
     * Get <p>标签ID列表</p> 
     * @return TagIDs <p>标签ID列表</p>
     */
    public String [] getTagIDs() {
        return this.TagIDs;
    }

    /**
     * Set <p>标签ID列表</p>
     * @param TagIDs <p>标签ID列表</p>
     */
    public void setTagIDs(String [] TagIDs) {
        this.TagIDs = TagIDs;
    }

    /**
     * Get <p>容器范围：0-指定集群 1-全部集群</p> 
     * @return TCSSScope <p>容器范围：0-指定集群 1-全部集群</p>
     */
    public Long getTCSSScope() {
        return this.TCSSScope;
    }

    /**
     * Set <p>容器范围：0-指定集群 1-全部集群</p>
     * @param TCSSScope <p>容器范围：0-指定集群 1-全部集群</p>
     */
    public void setTCSSScope(Long TCSSScope) {
        this.TCSSScope = TCSSScope;
    }

    /**
     * Get <p>指定集群列表（TCSSScope=0时使用）</p> 
     * @return ClusterIDsWithAppId <p>指定集群列表（TCSSScope=0时使用）</p>
     */
    public ClusterIDWithAppIdItem [] getClusterIDsWithAppId() {
        return this.ClusterIDsWithAppId;
    }

    /**
     * Set <p>指定集群列表（TCSSScope=0时使用）</p>
     * @param ClusterIDsWithAppId <p>指定集群列表（TCSSScope=0时使用）</p>
     */
    public void setClusterIDsWithAppId(ClusterIDWithAppIdItem [] ClusterIDsWithAppId) {
        this.ClusterIDsWithAppId = ClusterIDsWithAppId;
    }

    /**
     * Get <p>排除集群列表</p> 
     * @return ExcludeClusterIDsWithAppId <p>排除集群列表</p>
     */
    public ClusterIDWithAppIdItem [] getExcludeClusterIDsWithAppId() {
        return this.ExcludeClusterIDsWithAppId;
    }

    /**
     * Set <p>排除集群列表</p>
     * @param ExcludeClusterIDsWithAppId <p>排除集群列表</p>
     */
    public void setExcludeClusterIDsWithAppId(ClusterIDWithAppIdItem [] ExcludeClusterIDsWithAppId) {
        this.ExcludeClusterIDsWithAppId = ExcludeClusterIDsWithAppId;
    }

    public ModifyReverseShellSystemPolicyConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyReverseShellSystemPolicyConfigRequest(ModifyReverseShellSystemPolicyConfigRequest source) {
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.InnerNetAlarmShow != null) {
            this.InnerNetAlarmShow = new Boolean(source.InnerNetAlarmShow);
        }
        if (source.InnerIPShow != null) {
            this.InnerIPShow = new Boolean(source.InnerIPShow);
        }
        if (source.CWPScope != null) {
            this.CWPScope = new Long(source.CWPScope);
        }
        if (source.InstanceIDsWithAppId != null) {
            this.InstanceIDsWithAppId = new InstanceIDWithAppIdItem[source.InstanceIDsWithAppId.length];
            for (int i = 0; i < source.InstanceIDsWithAppId.length; i++) {
                this.InstanceIDsWithAppId[i] = new InstanceIDWithAppIdItem(source.InstanceIDsWithAppId[i]);
            }
        }
        if (source.ExcludeInstanceIDsWithAppId != null) {
            this.ExcludeInstanceIDsWithAppId = new InstanceIDWithAppIdItem[source.ExcludeInstanceIDsWithAppId.length];
            for (int i = 0; i < source.ExcludeInstanceIDsWithAppId.length; i++) {
                this.ExcludeInstanceIDsWithAppId[i] = new InstanceIDWithAppIdItem(source.ExcludeInstanceIDsWithAppId[i]);
            }
        }
        if (source.TagIDs != null) {
            this.TagIDs = new String[source.TagIDs.length];
            for (int i = 0; i < source.TagIDs.length; i++) {
                this.TagIDs[i] = new String(source.TagIDs[i]);
            }
        }
        if (source.TCSSScope != null) {
            this.TCSSScope = new Long(source.TCSSScope);
        }
        if (source.ClusterIDsWithAppId != null) {
            this.ClusterIDsWithAppId = new ClusterIDWithAppIdItem[source.ClusterIDsWithAppId.length];
            for (int i = 0; i < source.ClusterIDsWithAppId.length; i++) {
                this.ClusterIDsWithAppId[i] = new ClusterIDWithAppIdItem(source.ClusterIDsWithAppId[i]);
            }
        }
        if (source.ExcludeClusterIDsWithAppId != null) {
            this.ExcludeClusterIDsWithAppId = new ClusterIDWithAppIdItem[source.ExcludeClusterIDsWithAppId.length];
            for (int i = 0; i < source.ExcludeClusterIDsWithAppId.length; i++) {
                this.ExcludeClusterIDsWithAppId[i] = new ClusterIDWithAppIdItem(source.ExcludeClusterIDsWithAppId[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamSimple(map, prefix + "InnerNetAlarmShow", this.InnerNetAlarmShow);
        this.setParamSimple(map, prefix + "InnerIPShow", this.InnerIPShow);
        this.setParamSimple(map, prefix + "CWPScope", this.CWPScope);
        this.setParamArrayObj(map, prefix + "InstanceIDsWithAppId.", this.InstanceIDsWithAppId);
        this.setParamArrayObj(map, prefix + "ExcludeInstanceIDsWithAppId.", this.ExcludeInstanceIDsWithAppId);
        this.setParamArraySimple(map, prefix + "TagIDs.", this.TagIDs);
        this.setParamSimple(map, prefix + "TCSSScope", this.TCSSScope);
        this.setParamArrayObj(map, prefix + "ClusterIDsWithAppId.", this.ClusterIDsWithAppId);
        this.setParamArrayObj(map, prefix + "ExcludeClusterIDsWithAppId.", this.ExcludeClusterIDsWithAppId);

    }
}

