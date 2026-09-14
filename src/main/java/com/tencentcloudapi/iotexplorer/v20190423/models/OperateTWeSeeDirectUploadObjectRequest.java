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
package com.tencentcloudapi.iotexplorer.v20190423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OperateTWeSeeDirectUploadObjectRequest extends AbstractModel {

    /**
    * TWeSee 直传对象或目录的 COS URI
    */
    @SerializedName("COSURI")
    @Expose
    private String COSURI;

    /**
    * 操作类型。可选值：

- `HeadObject`：查询对象元数据
- `DeleteObject`：删除对象
- `ListBucket`：列举对象
    */
    @SerializedName("Operation")
    @Expose
    private String Operation;

    /**
    * 列举对象时使用的分页和目录选项
    */
    @SerializedName("ListOptions")
    @Expose
    private SeeObjectListOptions ListOptions;

    /**
     * Get TWeSee 直传对象或目录的 COS URI 
     * @return COSURI TWeSee 直传对象或目录的 COS URI
     */
    public String getCOSURI() {
        return this.COSURI;
    }

    /**
     * Set TWeSee 直传对象或目录的 COS URI
     * @param COSURI TWeSee 直传对象或目录的 COS URI
     */
    public void setCOSURI(String COSURI) {
        this.COSURI = COSURI;
    }

    /**
     * Get 操作类型。可选值：

- `HeadObject`：查询对象元数据
- `DeleteObject`：删除对象
- `ListBucket`：列举对象 
     * @return Operation 操作类型。可选值：

- `HeadObject`：查询对象元数据
- `DeleteObject`：删除对象
- `ListBucket`：列举对象
     */
    public String getOperation() {
        return this.Operation;
    }

    /**
     * Set 操作类型。可选值：

- `HeadObject`：查询对象元数据
- `DeleteObject`：删除对象
- `ListBucket`：列举对象
     * @param Operation 操作类型。可选值：

- `HeadObject`：查询对象元数据
- `DeleteObject`：删除对象
- `ListBucket`：列举对象
     */
    public void setOperation(String Operation) {
        this.Operation = Operation;
    }

    /**
     * Get 列举对象时使用的分页和目录选项 
     * @return ListOptions 列举对象时使用的分页和目录选项
     */
    public SeeObjectListOptions getListOptions() {
        return this.ListOptions;
    }

    /**
     * Set 列举对象时使用的分页和目录选项
     * @param ListOptions 列举对象时使用的分页和目录选项
     */
    public void setListOptions(SeeObjectListOptions ListOptions) {
        this.ListOptions = ListOptions;
    }

    public OperateTWeSeeDirectUploadObjectRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OperateTWeSeeDirectUploadObjectRequest(OperateTWeSeeDirectUploadObjectRequest source) {
        if (source.COSURI != null) {
            this.COSURI = new String(source.COSURI);
        }
        if (source.Operation != null) {
            this.Operation = new String(source.Operation);
        }
        if (source.ListOptions != null) {
            this.ListOptions = new SeeObjectListOptions(source.ListOptions);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "COSURI", this.COSURI);
        this.setParamSimple(map, prefix + "Operation", this.Operation);
        this.setParamObj(map, prefix + "ListOptions.", this.ListOptions);

    }
}

