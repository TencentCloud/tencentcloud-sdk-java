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
package com.tencentcloudapi.yunjing.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeComponentInfoResponse extends AbstractModel{

    /**
    * 组件ID。
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 组件名称。
    */
    @SerializedName("ComponentName")
    @Expose
    private String ComponentName;

    /**
    * 组件类型。
<li>WEB：web组件</li>
<li>SYSTEM：系统组件</li>
    */
    @SerializedName("ComponentType")
    @Expose
    private String ComponentType;

    /**
    * 组件官网。
    */
    @SerializedName("Homepage")
    @Expose
    private String Homepage;

    /**
    * 组件描述。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 组件ID。 
     * @return Id 组件ID。
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 组件ID。
     * @param Id 组件ID。
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 组件名称。 
     * @return ComponentName 组件名称。
     */
    public String getComponentName() {
        return this.ComponentName;
    }

    /**
     * Set 组件名称。
     * @param ComponentName 组件名称。
     */
    public void setComponentName(String ComponentName) {
        this.ComponentName = ComponentName;
    }

    /**
     * Get 组件类型。
<li>WEB：web组件</li>
<li>SYSTEM：系统组件</li> 
     * @return ComponentType 组件类型。
<li>WEB：web组件</li>
<li>SYSTEM：系统组件</li>
     */
    public String getComponentType() {
        return this.ComponentType;
    }

    /**
     * Set 组件类型。
<li>WEB：web组件</li>
<li>SYSTEM：系统组件</li>
     * @param ComponentType 组件类型。
<li>WEB：web组件</li>
<li>SYSTEM：系统组件</li>
     */
    public void setComponentType(String ComponentType) {
        this.ComponentType = ComponentType;
    }

    /**
     * Get 组件官网。 
     * @return Homepage 组件官网。
     */
    public String getHomepage() {
        return this.Homepage;
    }

    /**
     * Set 组件官网。
     * @param Homepage 组件官网。
     */
    public void setHomepage(String Homepage) {
        this.Homepage = Homepage;
    }

    /**
     * Get 组件描述。 
     * @return Description 组件描述。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 组件描述。
     * @param Description 组件描述。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "ComponentName", this.ComponentName);
        this.setParamSimple(map, prefix + "ComponentType", this.ComponentType);
        this.setParamSimple(map, prefix + "Homepage", this.Homepage);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

