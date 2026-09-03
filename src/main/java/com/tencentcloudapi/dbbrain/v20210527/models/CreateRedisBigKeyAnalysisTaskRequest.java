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
package com.tencentcloudapi.dbbrain.v20210527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateRedisBigKeyAnalysisTaskRequest extends AbstractModel {

    /**
    * <p>实例 ID。可通过 <a href="https://cloud.tencent.com/document/api/1130/57798">DescribeDiagDBInstances</a> 接口获取。</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>服务产品类型，支持值包括 &quot;redis&quot; - 云数据库 Redis。</p>
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
    * <p>分片节点序号列表。当列表为空时，选择所有分片节点。</p>
    */
    @SerializedName("ShardIds")
    @Expose
    private Long [] ShardIds;

    /**
    * <p>Top Key前缀的分隔符列表。<br>目前仅支持以下分割符：[&quot;,&quot;, &quot;;&quot;, &quot;:&quot;, &quot;_&quot;, &quot;-&quot;, &quot;+&quot;, &quot;@&quot;, &quot;=&quot;, &quot;|&quot;, &quot;#&quot;, &quot;.&quot;]，当列表为空时，默认选择所有分隔符。</p>
    */
    @SerializedName("KeyDelimiterList")
    @Expose
    private String [] KeyDelimiterList;

    /**
    * <p>历史备份文件ID</p>
    */
    @SerializedName("BackupId")
    @Expose
    private String BackupId;

    /**
     * Get <p>实例 ID。可通过 <a href="https://cloud.tencent.com/document/api/1130/57798">DescribeDiagDBInstances</a> 接口获取。</p> 
     * @return InstanceId <p>实例 ID。可通过 <a href="https://cloud.tencent.com/document/api/1130/57798">DescribeDiagDBInstances</a> 接口获取。</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>实例 ID。可通过 <a href="https://cloud.tencent.com/document/api/1130/57798">DescribeDiagDBInstances</a> 接口获取。</p>
     * @param InstanceId <p>实例 ID。可通过 <a href="https://cloud.tencent.com/document/api/1130/57798">DescribeDiagDBInstances</a> 接口获取。</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>服务产品类型，支持值包括 &quot;redis&quot; - 云数据库 Redis。</p> 
     * @return Product <p>服务产品类型，支持值包括 &quot;redis&quot; - 云数据库 Redis。</p>
     */
    public String getProduct() {
        return this.Product;
    }

    /**
     * Set <p>服务产品类型，支持值包括 &quot;redis&quot; - 云数据库 Redis。</p>
     * @param Product <p>服务产品类型，支持值包括 &quot;redis&quot; - 云数据库 Redis。</p>
     */
    public void setProduct(String Product) {
        this.Product = Product;
    }

    /**
     * Get <p>分片节点序号列表。当列表为空时，选择所有分片节点。</p> 
     * @return ShardIds <p>分片节点序号列表。当列表为空时，选择所有分片节点。</p>
     */
    public Long [] getShardIds() {
        return this.ShardIds;
    }

    /**
     * Set <p>分片节点序号列表。当列表为空时，选择所有分片节点。</p>
     * @param ShardIds <p>分片节点序号列表。当列表为空时，选择所有分片节点。</p>
     */
    public void setShardIds(Long [] ShardIds) {
        this.ShardIds = ShardIds;
    }

    /**
     * Get <p>Top Key前缀的分隔符列表。<br>目前仅支持以下分割符：[&quot;,&quot;, &quot;;&quot;, &quot;:&quot;, &quot;_&quot;, &quot;-&quot;, &quot;+&quot;, &quot;@&quot;, &quot;=&quot;, &quot;|&quot;, &quot;#&quot;, &quot;.&quot;]，当列表为空时，默认选择所有分隔符。</p> 
     * @return KeyDelimiterList <p>Top Key前缀的分隔符列表。<br>目前仅支持以下分割符：[&quot;,&quot;, &quot;;&quot;, &quot;:&quot;, &quot;_&quot;, &quot;-&quot;, &quot;+&quot;, &quot;@&quot;, &quot;=&quot;, &quot;|&quot;, &quot;#&quot;, &quot;.&quot;]，当列表为空时，默认选择所有分隔符。</p>
     */
    public String [] getKeyDelimiterList() {
        return this.KeyDelimiterList;
    }

    /**
     * Set <p>Top Key前缀的分隔符列表。<br>目前仅支持以下分割符：[&quot;,&quot;, &quot;;&quot;, &quot;:&quot;, &quot;_&quot;, &quot;-&quot;, &quot;+&quot;, &quot;@&quot;, &quot;=&quot;, &quot;|&quot;, &quot;#&quot;, &quot;.&quot;]，当列表为空时，默认选择所有分隔符。</p>
     * @param KeyDelimiterList <p>Top Key前缀的分隔符列表。<br>目前仅支持以下分割符：[&quot;,&quot;, &quot;;&quot;, &quot;:&quot;, &quot;_&quot;, &quot;-&quot;, &quot;+&quot;, &quot;@&quot;, &quot;=&quot;, &quot;|&quot;, &quot;#&quot;, &quot;.&quot;]，当列表为空时，默认选择所有分隔符。</p>
     */
    public void setKeyDelimiterList(String [] KeyDelimiterList) {
        this.KeyDelimiterList = KeyDelimiterList;
    }

    /**
     * Get <p>历史备份文件ID</p> 
     * @return BackupId <p>历史备份文件ID</p>
     */
    public String getBackupId() {
        return this.BackupId;
    }

    /**
     * Set <p>历史备份文件ID</p>
     * @param BackupId <p>历史备份文件ID</p>
     */
    public void setBackupId(String BackupId) {
        this.BackupId = BackupId;
    }

    public CreateRedisBigKeyAnalysisTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateRedisBigKeyAnalysisTaskRequest(CreateRedisBigKeyAnalysisTaskRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Product != null) {
            this.Product = new String(source.Product);
        }
        if (source.ShardIds != null) {
            this.ShardIds = new Long[source.ShardIds.length];
            for (int i = 0; i < source.ShardIds.length; i++) {
                this.ShardIds[i] = new Long(source.ShardIds[i]);
            }
        }
        if (source.KeyDelimiterList != null) {
            this.KeyDelimiterList = new String[source.KeyDelimiterList.length];
            for (int i = 0; i < source.KeyDelimiterList.length; i++) {
                this.KeyDelimiterList[i] = new String(source.KeyDelimiterList[i]);
            }
        }
        if (source.BackupId != null) {
            this.BackupId = new String(source.BackupId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Product", this.Product);
        this.setParamArraySimple(map, prefix + "ShardIds.", this.ShardIds);
        this.setParamArraySimple(map, prefix + "KeyDelimiterList.", this.KeyDelimiterList);
        this.setParamSimple(map, prefix + "BackupId", this.BackupId);

    }
}

