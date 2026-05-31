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
package com.tencentcloudapi.tokenhub.v20260322.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateTokenPlanApiKeysResponse extends AbstractModel {

    /**
    * 成功创建的项列表。
    */
    @SerializedName("Items")
    @Expose
    private CreateApiKeysResultItem [] Items;

    /**
    * 创建失败的项列表。
    */
    @SerializedName("FailedItems")
    @Expose
    private BatchCreateFailedItem [] FailedItems;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 成功创建的项列表。 
     * @return Items 成功创建的项列表。
     */
    public CreateApiKeysResultItem [] getItems() {
        return this.Items;
    }

    /**
     * Set 成功创建的项列表。
     * @param Items 成功创建的项列表。
     */
    public void setItems(CreateApiKeysResultItem [] Items) {
        this.Items = Items;
    }

    /**
     * Get 创建失败的项列表。 
     * @return FailedItems 创建失败的项列表。
     */
    public BatchCreateFailedItem [] getFailedItems() {
        return this.FailedItems;
    }

    /**
     * Set 创建失败的项列表。
     * @param FailedItems 创建失败的项列表。
     */
    public void setFailedItems(BatchCreateFailedItem [] FailedItems) {
        this.FailedItems = FailedItems;
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

    public CreateTokenPlanApiKeysResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateTokenPlanApiKeysResponse(CreateTokenPlanApiKeysResponse source) {
        if (source.Items != null) {
            this.Items = new CreateApiKeysResultItem[source.Items.length];
            for (int i = 0; i < source.Items.length; i++) {
                this.Items[i] = new CreateApiKeysResultItem(source.Items[i]);
            }
        }
        if (source.FailedItems != null) {
            this.FailedItems = new BatchCreateFailedItem[source.FailedItems.length];
            for (int i = 0; i < source.FailedItems.length; i++) {
                this.FailedItems[i] = new BatchCreateFailedItem(source.FailedItems[i]);
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
        this.setParamArrayObj(map, prefix + "Items.", this.Items);
        this.setParamArrayObj(map, prefix + "FailedItems.", this.FailedItems);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

