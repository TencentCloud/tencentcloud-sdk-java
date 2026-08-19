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

public class DescribeReverseShellSystemPolicyConfigResponse extends AbstractModel {

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
    * <p>主机范围</p>
    */
    @SerializedName("CWPScope")
    @Expose
    private Long CWPScope;

    /**
    * <p>指定主机instance_id列表</p>
    */
    @SerializedName("InstanceIDs")
    @Expose
    private String [] InstanceIDs;

    /**
    * <p>排除主机instance_id列表</p>
    */
    @SerializedName("ExcludeInstanceIDs")
    @Expose
    private String [] ExcludeInstanceIDs;

    /**
    * <p>标签ID列表</p>
    */
    @SerializedName("TagIDs")
    @Expose
    private String [] TagIDs;

    /**
    * <p>容器范围</p>
    */
    @SerializedName("TCSSScope")
    @Expose
    private Long TCSSScope;

    /**
    * <p>指定集群ID列表</p>
    */
    @SerializedName("ClusterIDs")
    @Expose
    private String [] ClusterIDs;

    /**
    * <p>排除集群ID列表</p>
    */
    @SerializedName("ExcludeClusterIDs")
    @Expose
    private String [] ExcludeClusterIDs;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

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
     * Get <p>主机范围</p> 
     * @return CWPScope <p>主机范围</p>
     */
    public Long getCWPScope() {
        return this.CWPScope;
    }

    /**
     * Set <p>主机范围</p>
     * @param CWPScope <p>主机范围</p>
     */
    public void setCWPScope(Long CWPScope) {
        this.CWPScope = CWPScope;
    }

    /**
     * Get <p>指定主机instance_id列表</p> 
     * @return InstanceIDs <p>指定主机instance_id列表</p>
     */
    public String [] getInstanceIDs() {
        return this.InstanceIDs;
    }

    /**
     * Set <p>指定主机instance_id列表</p>
     * @param InstanceIDs <p>指定主机instance_id列表</p>
     */
    public void setInstanceIDs(String [] InstanceIDs) {
        this.InstanceIDs = InstanceIDs;
    }

    /**
     * Get <p>排除主机instance_id列表</p> 
     * @return ExcludeInstanceIDs <p>排除主机instance_id列表</p>
     */
    public String [] getExcludeInstanceIDs() {
        return this.ExcludeInstanceIDs;
    }

    /**
     * Set <p>排除主机instance_id列表</p>
     * @param ExcludeInstanceIDs <p>排除主机instance_id列表</p>
     */
    public void setExcludeInstanceIDs(String [] ExcludeInstanceIDs) {
        this.ExcludeInstanceIDs = ExcludeInstanceIDs;
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
     * Get <p>容器范围</p> 
     * @return TCSSScope <p>容器范围</p>
     */
    public Long getTCSSScope() {
        return this.TCSSScope;
    }

    /**
     * Set <p>容器范围</p>
     * @param TCSSScope <p>容器范围</p>
     */
    public void setTCSSScope(Long TCSSScope) {
        this.TCSSScope = TCSSScope;
    }

    /**
     * Get <p>指定集群ID列表</p> 
     * @return ClusterIDs <p>指定集群ID列表</p>
     */
    public String [] getClusterIDs() {
        return this.ClusterIDs;
    }

    /**
     * Set <p>指定集群ID列表</p>
     * @param ClusterIDs <p>指定集群ID列表</p>
     */
    public void setClusterIDs(String [] ClusterIDs) {
        this.ClusterIDs = ClusterIDs;
    }

    /**
     * Get <p>排除集群ID列表</p> 
     * @return ExcludeClusterIDs <p>排除集群ID列表</p>
     */
    public String [] getExcludeClusterIDs() {
        return this.ExcludeClusterIDs;
    }

    /**
     * Set <p>排除集群ID列表</p>
     * @param ExcludeClusterIDs <p>排除集群ID列表</p>
     */
    public void setExcludeClusterIDs(String [] ExcludeClusterIDs) {
        this.ExcludeClusterIDs = ExcludeClusterIDs;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeReverseShellSystemPolicyConfigResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeReverseShellSystemPolicyConfigResponse(DescribeReverseShellSystemPolicyConfigResponse source) {
        if (source.InnerNetAlarmShow != null) {
            this.InnerNetAlarmShow = new Boolean(source.InnerNetAlarmShow);
        }
        if (source.InnerIPShow != null) {
            this.InnerIPShow = new Boolean(source.InnerIPShow);
        }
        if (source.CWPScope != null) {
            this.CWPScope = new Long(source.CWPScope);
        }
        if (source.InstanceIDs != null) {
            this.InstanceIDs = new String[source.InstanceIDs.length];
            for (int i = 0; i < source.InstanceIDs.length; i++) {
                this.InstanceIDs[i] = new String(source.InstanceIDs[i]);
            }
        }
        if (source.ExcludeInstanceIDs != null) {
            this.ExcludeInstanceIDs = new String[source.ExcludeInstanceIDs.length];
            for (int i = 0; i < source.ExcludeInstanceIDs.length; i++) {
                this.ExcludeInstanceIDs[i] = new String(source.ExcludeInstanceIDs[i]);
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
        if (source.ClusterIDs != null) {
            this.ClusterIDs = new String[source.ClusterIDs.length];
            for (int i = 0; i < source.ClusterIDs.length; i++) {
                this.ClusterIDs[i] = new String(source.ClusterIDs[i]);
            }
        }
        if (source.ExcludeClusterIDs != null) {
            this.ExcludeClusterIDs = new String[source.ExcludeClusterIDs.length];
            for (int i = 0; i < source.ExcludeClusterIDs.length; i++) {
                this.ExcludeClusterIDs[i] = new String(source.ExcludeClusterIDs[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InnerNetAlarmShow", this.InnerNetAlarmShow);
        this.setParamSimple(map, prefix + "InnerIPShow", this.InnerIPShow);
        this.setParamSimple(map, prefix + "CWPScope", this.CWPScope);
        this.setParamArraySimple(map, prefix + "InstanceIDs.", this.InstanceIDs);
        this.setParamArraySimple(map, prefix + "ExcludeInstanceIDs.", this.ExcludeInstanceIDs);
        this.setParamArraySimple(map, prefix + "TagIDs.", this.TagIDs);
        this.setParamSimple(map, prefix + "TCSSScope", this.TCSSScope);
        this.setParamArraySimple(map, prefix + "ClusterIDs.", this.ClusterIDs);
        this.setParamArraySimple(map, prefix + "ExcludeClusterIDs.", this.ExcludeClusterIDs);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

