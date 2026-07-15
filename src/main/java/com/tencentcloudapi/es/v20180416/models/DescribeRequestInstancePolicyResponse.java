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
package com.tencentcloudapi.es.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRequestInstancePolicyResponse extends AbstractModel {

    /**
    * <p>GET路径可请求的命令合集</p>
    */
    @SerializedName("GetPaths")
    @Expose
    private String [] GetPaths;

    /**
    * <p>POST路径可请求的命令合集</p>
    */
    @SerializedName("PostPaths")
    @Expose
    private String [] PostPaths;

    /**
    * <p>PUT路径可请求的命令合集</p>
    */
    @SerializedName("PutPaths")
    @Expose
    private String [] PutPaths;

    /**
    * <p>是否是默认的参数</p>
    */
    @SerializedName("IsDefault")
    @Expose
    private Boolean IsDefault;

    /**
    * <p>变更时间</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * <p>变更人</p>
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>GET路径可请求的命令合集</p> 
     * @return GetPaths <p>GET路径可请求的命令合集</p>
     */
    public String [] getGetPaths() {
        return this.GetPaths;
    }

    /**
     * Set <p>GET路径可请求的命令合集</p>
     * @param GetPaths <p>GET路径可请求的命令合集</p>
     */
    public void setGetPaths(String [] GetPaths) {
        this.GetPaths = GetPaths;
    }

    /**
     * Get <p>POST路径可请求的命令合集</p> 
     * @return PostPaths <p>POST路径可请求的命令合集</p>
     */
    public String [] getPostPaths() {
        return this.PostPaths;
    }

    /**
     * Set <p>POST路径可请求的命令合集</p>
     * @param PostPaths <p>POST路径可请求的命令合集</p>
     */
    public void setPostPaths(String [] PostPaths) {
        this.PostPaths = PostPaths;
    }

    /**
     * Get <p>PUT路径可请求的命令合集</p> 
     * @return PutPaths <p>PUT路径可请求的命令合集</p>
     */
    public String [] getPutPaths() {
        return this.PutPaths;
    }

    /**
     * Set <p>PUT路径可请求的命令合集</p>
     * @param PutPaths <p>PUT路径可请求的命令合集</p>
     */
    public void setPutPaths(String [] PutPaths) {
        this.PutPaths = PutPaths;
    }

    /**
     * Get <p>是否是默认的参数</p> 
     * @return IsDefault <p>是否是默认的参数</p>
     */
    public Boolean getIsDefault() {
        return this.IsDefault;
    }

    /**
     * Set <p>是否是默认的参数</p>
     * @param IsDefault <p>是否是默认的参数</p>
     */
    public void setIsDefault(Boolean IsDefault) {
        this.IsDefault = IsDefault;
    }

    /**
     * Get <p>变更时间</p> 
     * @return UpdateTime <p>变更时间</p>
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>变更时间</p>
     * @param UpdateTime <p>变更时间</p>
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get <p>变更人</p> 
     * @return Operator <p>变更人</p>
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set <p>变更人</p>
     * @param Operator <p>变更人</p>
     */
    public void setOperator(String Operator) {
        this.Operator = Operator;
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

    public DescribeRequestInstancePolicyResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRequestInstancePolicyResponse(DescribeRequestInstancePolicyResponse source) {
        if (source.GetPaths != null) {
            this.GetPaths = new String[source.GetPaths.length];
            for (int i = 0; i < source.GetPaths.length; i++) {
                this.GetPaths[i] = new String(source.GetPaths[i]);
            }
        }
        if (source.PostPaths != null) {
            this.PostPaths = new String[source.PostPaths.length];
            for (int i = 0; i < source.PostPaths.length; i++) {
                this.PostPaths[i] = new String(source.PostPaths[i]);
            }
        }
        if (source.PutPaths != null) {
            this.PutPaths = new String[source.PutPaths.length];
            for (int i = 0; i < source.PutPaths.length; i++) {
                this.PutPaths[i] = new String(source.PutPaths[i]);
            }
        }
        if (source.IsDefault != null) {
            this.IsDefault = new Boolean(source.IsDefault);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.Operator != null) {
            this.Operator = new String(source.Operator);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "GetPaths.", this.GetPaths);
        this.setParamArraySimple(map, prefix + "PostPaths.", this.PostPaths);
        this.setParamArraySimple(map, prefix + "PutPaths.", this.PutPaths);
        this.setParamSimple(map, prefix + "IsDefault", this.IsDefault);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "Operator", this.Operator);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

