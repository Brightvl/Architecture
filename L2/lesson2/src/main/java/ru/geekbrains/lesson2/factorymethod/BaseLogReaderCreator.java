package ru.geekbrains.lesson2.factorymethod;

import ru.geekbrains.lesson2.templatemethod.LogReader;

public abstract class BaseLogReaderCreator {


    public LogReader createLogReader(LogType logType, Object data){
        LogReader logReader = createLogReaderInstance(logType);
        logReader.setDataSource(data);
        return logReader;
    }

    /**
     * Фабричный метод
     * @param logType тип лог-ридера
     * @return конкретный объект лог-ридера
     */
    protected abstract LogReader createLogReaderInstance(LogType logType);

}
