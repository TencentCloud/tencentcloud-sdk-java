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
package com.tencentcloudapi.dsgc.v20190723.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAssetOverviewResponse extends AbstractModel {

    /**
    * 数据库实例id
    */
    @SerializedName("DBInstanceNums")
    @Expose
    private Long DBInstanceNums;

    /**
    * 数据库个数
    */
    @SerializedName("DBNums")
    @Expose
    private Long DBNums;

    /**
    * 表的个数
    */
    @SerializedName("TableNums")
    @Expose
    private Long TableNums;

    /**
    * 字段个数
    */
    @SerializedName("FieldNums")
    @Expose
    private Long FieldNums;

    /**
    * 数据库实例的分布情况
    */
    @SerializedName("DBInstanceDistribution")
    @Expose
    private Note [] DBInstanceDistribution;

    /**
    * db分布情况
    */
    @SerializedName("DBDistribution")
    @Expose
    private Note [] DBDistribution;

    /**
    * cos桶的数量
    */
    @SerializedName("BucketNums")
    @Expose
    private Long BucketNums;

    /**
    * 文件个数
    */
    @SerializedName("FileNums")
    @Expose
    private Long FileNums;

    /**
    * 用于对用户进行提示信息
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * es实例数量
    */
    @SerializedName("EsInstanceNums")
    @Expose
    private Long EsInstanceNums;

    /**
    * es索引数量
    */
    @SerializedName("EsIndexNums")
    @Expose
    private Long EsIndexNums;

    /**
    * es字段数量
    */
    @SerializedName("EsFieldNums")
    @Expose
    private Long EsFieldNums;

    /**
    * mongo实例数量
    */
    @SerializedName("MongoInstanceNums")
    @Expose
    private Long MongoInstanceNums;

    /**
    * mongo数据库数量
    */
    @SerializedName("MongoDbNums")
    @Expose
    private Long MongoDbNums;

    /**
    * mongo集合数量
    */
    @SerializedName("MongoColNums")
    @Expose
    private Long MongoColNums;

    /**
    * mongo字段数量
    */
    @SerializedName("MongoFieldNums")
    @Expose
    private Long MongoFieldNums;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 数据库实例id 
     * @return DBInstanceNums 数据库实例id
     */
    public Long getDBInstanceNums() {
        return this.DBInstanceNums;
    }

    /**
     * Set 数据库实例id
     * @param DBInstanceNums 数据库实例id
     */
    public void setDBInstanceNums(Long DBInstanceNums) {
        this.DBInstanceNums = DBInstanceNums;
    }

    /**
     * Get 数据库个数 
     * @return DBNums 数据库个数
     */
    public Long getDBNums() {
        return this.DBNums;
    }

    /**
     * Set 数据库个数
     * @param DBNums 数据库个数
     */
    public void setDBNums(Long DBNums) {
        this.DBNums = DBNums;
    }

    /**
     * Get 表的个数 
     * @return TableNums 表的个数
     */
    public Long getTableNums() {
        return this.TableNums;
    }

    /**
     * Set 表的个数
     * @param TableNums 表的个数
     */
    public void setTableNums(Long TableNums) {
        this.TableNums = TableNums;
    }

    /**
     * Get 字段个数 
     * @return FieldNums 字段个数
     */
    public Long getFieldNums() {
        return this.FieldNums;
    }

    /**
     * Set 字段个数
     * @param FieldNums 字段个数
     */
    public void setFieldNums(Long FieldNums) {
        this.FieldNums = FieldNums;
    }

    /**
     * Get 数据库实例的分布情况 
     * @return DBInstanceDistribution 数据库实例的分布情况
     */
    public Note [] getDBInstanceDistribution() {
        return this.DBInstanceDistribution;
    }

    /**
     * Set 数据库实例的分布情况
     * @param DBInstanceDistribution 数据库实例的分布情况
     */
    public void setDBInstanceDistribution(Note [] DBInstanceDistribution) {
        this.DBInstanceDistribution = DBInstanceDistribution;
    }

    /**
     * Get db分布情况 
     * @return DBDistribution db分布情况
     */
    public Note [] getDBDistribution() {
        return this.DBDistribution;
    }

    /**
     * Set db分布情况
     * @param DBDistribution db分布情况
     */
    public void setDBDistribution(Note [] DBDistribution) {
        this.DBDistribution = DBDistribution;
    }

    /**
     * Get cos桶的数量 
     * @return BucketNums cos桶的数量
     */
    public Long getBucketNums() {
        return this.BucketNums;
    }

    /**
     * Set cos桶的数量
     * @param BucketNums cos桶的数量
     */
    public void setBucketNums(Long BucketNums) {
        this.BucketNums = BucketNums;
    }

    /**
     * Get 文件个数 
     * @return FileNums 文件个数
     */
    public Long getFileNums() {
        return this.FileNums;
    }

    /**
     * Set 文件个数
     * @param FileNums 文件个数
     */
    public void setFileNums(Long FileNums) {
        this.FileNums = FileNums;
    }

    /**
     * Get 用于对用户进行提示信息 
     * @return Remark 用于对用户进行提示信息
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 用于对用户进行提示信息
     * @param Remark 用于对用户进行提示信息
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get es实例数量 
     * @return EsInstanceNums es实例数量
     */
    public Long getEsInstanceNums() {
        return this.EsInstanceNums;
    }

    /**
     * Set es实例数量
     * @param EsInstanceNums es实例数量
     */
    public void setEsInstanceNums(Long EsInstanceNums) {
        this.EsInstanceNums = EsInstanceNums;
    }

    /**
     * Get es索引数量 
     * @return EsIndexNums es索引数量
     */
    public Long getEsIndexNums() {
        return this.EsIndexNums;
    }

    /**
     * Set es索引数量
     * @param EsIndexNums es索引数量
     */
    public void setEsIndexNums(Long EsIndexNums) {
        this.EsIndexNums = EsIndexNums;
    }

    /**
     * Get es字段数量 
     * @return EsFieldNums es字段数量
     */
    public Long getEsFieldNums() {
        return this.EsFieldNums;
    }

    /**
     * Set es字段数量
     * @param EsFieldNums es字段数量
     */
    public void setEsFieldNums(Long EsFieldNums) {
        this.EsFieldNums = EsFieldNums;
    }

    /**
     * Get mongo实例数量 
     * @return MongoInstanceNums mongo实例数量
     */
    public Long getMongoInstanceNums() {
        return this.MongoInstanceNums;
    }

    /**
     * Set mongo实例数量
     * @param MongoInstanceNums mongo实例数量
     */
    public void setMongoInstanceNums(Long MongoInstanceNums) {
        this.MongoInstanceNums = MongoInstanceNums;
    }

    /**
     * Get mongo数据库数量 
     * @return MongoDbNums mongo数据库数量
     */
    public Long getMongoDbNums() {
        return this.MongoDbNums;
    }

    /**
     * Set mongo数据库数量
     * @param MongoDbNums mongo数据库数量
     */
    public void setMongoDbNums(Long MongoDbNums) {
        this.MongoDbNums = MongoDbNums;
    }

    /**
     * Get mongo集合数量 
     * @return MongoColNums mongo集合数量
     */
    public Long getMongoColNums() {
        return this.MongoColNums;
    }

    /**
     * Set mongo集合数量
     * @param MongoColNums mongo集合数量
     */
    public void setMongoColNums(Long MongoColNums) {
        this.MongoColNums = MongoColNums;
    }

    /**
     * Get mongo字段数量 
     * @return MongoFieldNums mongo字段数量
     */
    public Long getMongoFieldNums() {
        return this.MongoFieldNums;
    }

    /**
     * Set mongo字段数量
     * @param MongoFieldNums mongo字段数量
     */
    public void setMongoFieldNums(Long MongoFieldNums) {
        this.MongoFieldNums = MongoFieldNums;
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

    public DescribeAssetOverviewResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAssetOverviewResponse(DescribeAssetOverviewResponse source) {
        if (source.DBInstanceNums != null) {
            this.DBInstanceNums = new Long(source.DBInstanceNums);
        }
        if (source.DBNums != null) {
            this.DBNums = new Long(source.DBNums);
        }
        if (source.TableNums != null) {
            this.TableNums = new Long(source.TableNums);
        }
        if (source.FieldNums != null) {
            this.FieldNums = new Long(source.FieldNums);
        }
        if (source.DBInstanceDistribution != null) {
            this.DBInstanceDistribution = new Note[source.DBInstanceDistribution.length];
            for (int i = 0; i < source.DBInstanceDistribution.length; i++) {
                this.DBInstanceDistribution[i] = new Note(source.DBInstanceDistribution[i]);
            }
        }
        if (source.DBDistribution != null) {
            this.DBDistribution = new Note[source.DBDistribution.length];
            for (int i = 0; i < source.DBDistribution.length; i++) {
                this.DBDistribution[i] = new Note(source.DBDistribution[i]);
            }
        }
        if (source.BucketNums != null) {
            this.BucketNums = new Long(source.BucketNums);
        }
        if (source.FileNums != null) {
            this.FileNums = new Long(source.FileNums);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.EsInstanceNums != null) {
            this.EsInstanceNums = new Long(source.EsInstanceNums);
        }
        if (source.EsIndexNums != null) {
            this.EsIndexNums = new Long(source.EsIndexNums);
        }
        if (source.EsFieldNums != null) {
            this.EsFieldNums = new Long(source.EsFieldNums);
        }
        if (source.MongoInstanceNums != null) {
            this.MongoInstanceNums = new Long(source.MongoInstanceNums);
        }
        if (source.MongoDbNums != null) {
            this.MongoDbNums = new Long(source.MongoDbNums);
        }
        if (source.MongoColNums != null) {
            this.MongoColNums = new Long(source.MongoColNums);
        }
        if (source.MongoFieldNums != null) {
            this.MongoFieldNums = new Long(source.MongoFieldNums);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DBInstanceNums", this.DBInstanceNums);
        this.setParamSimple(map, prefix + "DBNums", this.DBNums);
        this.setParamSimple(map, prefix + "TableNums", this.TableNums);
        this.setParamSimple(map, prefix + "FieldNums", this.FieldNums);
        this.setParamArrayObj(map, prefix + "DBInstanceDistribution.", this.DBInstanceDistribution);
        this.setParamArrayObj(map, prefix + "DBDistribution.", this.DBDistribution);
        this.setParamSimple(map, prefix + "BucketNums", this.BucketNums);
        this.setParamSimple(map, prefix + "FileNums", this.FileNums);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "EsInstanceNums", this.EsInstanceNums);
        this.setParamSimple(map, prefix + "EsIndexNums", this.EsIndexNums);
        this.setParamSimple(map, prefix + "EsFieldNums", this.EsFieldNums);
        this.setParamSimple(map, prefix + "MongoInstanceNums", this.MongoInstanceNums);
        this.setParamSimple(map, prefix + "MongoDbNums", this.MongoDbNums);
        this.setParamSimple(map, prefix + "MongoColNums", this.MongoColNums);
        this.setParamSimple(map, prefix + "MongoFieldNums", this.MongoFieldNums);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

