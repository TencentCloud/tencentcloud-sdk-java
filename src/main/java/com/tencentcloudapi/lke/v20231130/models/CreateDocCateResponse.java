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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateDocCateResponse extends AbstractModel {

    /**
    * 是否可新增

    */
    @SerializedName("CanAdd")
    @Expose
    private Boolean CanAdd;

    /**
    * 是否可编辑
    */
    @SerializedName("CanEdit")
    @Expose
    private Boolean CanEdit;

    /**
    * 是否可删除

    */
    @SerializedName("CanDelete")
    @Expose
    private Boolean CanDelete;

    /**
    * 分类业务ID
    */
    @SerializedName("CateBizId")
    @Expose
    private String CateBizId;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 是否可新增
 
     * @return CanAdd 是否可新增

     */
    public Boolean getCanAdd() {
        return this.CanAdd;
    }

    /**
     * Set 是否可新增

     * @param CanAdd 是否可新增

     */
    public void setCanAdd(Boolean CanAdd) {
        this.CanAdd = CanAdd;
    }

    /**
     * Get 是否可编辑 
     * @return CanEdit 是否可编辑
     */
    public Boolean getCanEdit() {
        return this.CanEdit;
    }

    /**
     * Set 是否可编辑
     * @param CanEdit 是否可编辑
     */
    public void setCanEdit(Boolean CanEdit) {
        this.CanEdit = CanEdit;
    }

    /**
     * Get 是否可删除
 
     * @return CanDelete 是否可删除

     */
    public Boolean getCanDelete() {
        return this.CanDelete;
    }

    /**
     * Set 是否可删除

     * @param CanDelete 是否可删除

     */
    public void setCanDelete(Boolean CanDelete) {
        this.CanDelete = CanDelete;
    }

    /**
     * Get 分类业务ID 
     * @return CateBizId 分类业务ID
     */
    public String getCateBizId() {
        return this.CateBizId;
    }

    /**
     * Set 分类业务ID
     * @param CateBizId 分类业务ID
     */
    public void setCateBizId(String CateBizId) {
        this.CateBizId = CateBizId;
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

    public CreateDocCateResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateDocCateResponse(CreateDocCateResponse source) {
        if (source.CanAdd != null) {
            this.CanAdd = new Boolean(source.CanAdd);
        }
        if (source.CanEdit != null) {
            this.CanEdit = new Boolean(source.CanEdit);
        }
        if (source.CanDelete != null) {
            this.CanDelete = new Boolean(source.CanDelete);
        }
        if (source.CateBizId != null) {
            this.CateBizId = new String(source.CateBizId);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CanAdd", this.CanAdd);
        this.setParamSimple(map, prefix + "CanEdit", this.CanEdit);
        this.setParamSimple(map, prefix + "CanDelete", this.CanDelete);
        this.setParamSimple(map, prefix + "CateBizId", this.CateBizId);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

