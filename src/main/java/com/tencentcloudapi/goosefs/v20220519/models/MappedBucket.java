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
package com.tencentcloudapi.goosefs.v20220519.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MappedBucket extends AbstractModel{

    /**
    * 对象存储Bucket名
    */
    @SerializedName("BucketName")
    @Expose
    private String BucketName;

    /**
    * 映射到的文件系统路径, 默认为/
    */
    @SerializedName("FileSystemPath")
    @Expose
    private String FileSystemPath;

    /**
    * 数据流动的自动策略, 包含加载与沉降。策略可以是多种的组合
按需加载(OnDemandImport)
自动加载元数据(AutoImportMeta)
自动加载数据(AutoImportData)
周期加载(PeriodImport)

周期沉降(PeriodExport)
立即沉降(ImmediateExport)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DataRepositoryTaskAutoStrategy")
    @Expose
    private String [] DataRepositoryTaskAutoStrategy;

    /**
    * 绑定bucket的数据流动策略ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * 规则备注与描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RuleDescription")
    @Expose
    private String RuleDescription;

    /**
     * Get 对象存储Bucket名 
     * @return BucketName 对象存储Bucket名
     */
    public String getBucketName() {
        return this.BucketName;
    }

    /**
     * Set 对象存储Bucket名
     * @param BucketName 对象存储Bucket名
     */
    public void setBucketName(String BucketName) {
        this.BucketName = BucketName;
    }

    /**
     * Get 映射到的文件系统路径, 默认为/ 
     * @return FileSystemPath 映射到的文件系统路径, 默认为/
     */
    public String getFileSystemPath() {
        return this.FileSystemPath;
    }

    /**
     * Set 映射到的文件系统路径, 默认为/
     * @param FileSystemPath 映射到的文件系统路径, 默认为/
     */
    public void setFileSystemPath(String FileSystemPath) {
        this.FileSystemPath = FileSystemPath;
    }

    /**
     * Get 数据流动的自动策略, 包含加载与沉降。策略可以是多种的组合
按需加载(OnDemandImport)
自动加载元数据(AutoImportMeta)
自动加载数据(AutoImportData)
周期加载(PeriodImport)

周期沉降(PeriodExport)
立即沉降(ImmediateExport)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DataRepositoryTaskAutoStrategy 数据流动的自动策略, 包含加载与沉降。策略可以是多种的组合
按需加载(OnDemandImport)
自动加载元数据(AutoImportMeta)
自动加载数据(AutoImportData)
周期加载(PeriodImport)

周期沉降(PeriodExport)
立即沉降(ImmediateExport)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getDataRepositoryTaskAutoStrategy() {
        return this.DataRepositoryTaskAutoStrategy;
    }

    /**
     * Set 数据流动的自动策略, 包含加载与沉降。策略可以是多种的组合
按需加载(OnDemandImport)
自动加载元数据(AutoImportMeta)
自动加载数据(AutoImportData)
周期加载(PeriodImport)

周期沉降(PeriodExport)
立即沉降(ImmediateExport)
注意：此字段可能返回 null，表示取不到有效值。
     * @param DataRepositoryTaskAutoStrategy 数据流动的自动策略, 包含加载与沉降。策略可以是多种的组合
按需加载(OnDemandImport)
自动加载元数据(AutoImportMeta)
自动加载数据(AutoImportData)
周期加载(PeriodImport)

周期沉降(PeriodExport)
立即沉降(ImmediateExport)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDataRepositoryTaskAutoStrategy(String [] DataRepositoryTaskAutoStrategy) {
        this.DataRepositoryTaskAutoStrategy = DataRepositoryTaskAutoStrategy;
    }

    /**
     * Get 绑定bucket的数据流动策略ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RuleId 绑定bucket的数据流动策略ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set 绑定bucket的数据流动策略ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param RuleId 绑定bucket的数据流动策略ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get 规则备注与描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RuleDescription 规则备注与描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRuleDescription() {
        return this.RuleDescription;
    }

    /**
     * Set 规则备注与描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param RuleDescription 规则备注与描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRuleDescription(String RuleDescription) {
        this.RuleDescription = RuleDescription;
    }

    public MappedBucket() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MappedBucket(MappedBucket source) {
        if (source.BucketName != null) {
            this.BucketName = new String(source.BucketName);
        }
        if (source.FileSystemPath != null) {
            this.FileSystemPath = new String(source.FileSystemPath);
        }
        if (source.DataRepositoryTaskAutoStrategy != null) {
            this.DataRepositoryTaskAutoStrategy = new String[source.DataRepositoryTaskAutoStrategy.length];
            for (int i = 0; i < source.DataRepositoryTaskAutoStrategy.length; i++) {
                this.DataRepositoryTaskAutoStrategy[i] = new String(source.DataRepositoryTaskAutoStrategy[i]);
            }
        }
        if (source.RuleId != null) {
            this.RuleId = new String(source.RuleId);
        }
        if (source.RuleDescription != null) {
            this.RuleDescription = new String(source.RuleDescription);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BucketName", this.BucketName);
        this.setParamSimple(map, prefix + "FileSystemPath", this.FileSystemPath);
        this.setParamArraySimple(map, prefix + "DataRepositoryTaskAutoStrategy.", this.DataRepositoryTaskAutoStrategy);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "RuleDescription", this.RuleDescription);

    }
}

