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
package com.tencentcloudapi.cat.v20180409.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTasksByTypeRequest extends AbstractModel{

    /**
    * 从第Offset 条开始查询。缺省值为0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 本批次查询Limit 条记录。缺省值为20
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 拨测任务类型。0 站点监控，2 可用性监控。缺省值为2
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
     * Get 从第Offset 条开始查询。缺省值为0 
     * @return Offset 从第Offset 条开始查询。缺省值为0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 从第Offset 条开始查询。缺省值为0
     * @param Offset 从第Offset 条开始查询。缺省值为0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 本批次查询Limit 条记录。缺省值为20 
     * @return Limit 本批次查询Limit 条记录。缺省值为20
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 本批次查询Limit 条记录。缺省值为20
     * @param Limit 本批次查询Limit 条记录。缺省值为20
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 拨测任务类型。0 站点监控，2 可用性监控。缺省值为2 
     * @return Type 拨测任务类型。0 站点监控，2 可用性监控。缺省值为2
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 拨测任务类型。0 站点监控，2 可用性监控。缺省值为2
     * @param Type 拨测任务类型。0 站点监控，2 可用性监控。缺省值为2
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

